package com.springmongo.Serivce;

import com.springmongo.Entity.DriverCache;
import com.springmongo.Repository.DriverCacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverCacheService implements IDriverCacheService {

    @Autowired
    private DriverCacheRepository driverCacheRepository;

    @Override
    public List<DriverCache> getAllCache() {
        return driverCacheRepository.findAll();
    }

    @Override
    public DriverCache getOneCache(Long id) {
        return driverCacheRepository.findByDriverId(id);
    }

    @Override
    public DriverCache addCache(DriverCache driverCache) {
        return driverCacheRepository.insert(driverCache);
    }

    @Override
    public boolean updateCache(Long driverId, DriverCache driverCache) {
        Optional<DriverCache> driverCacheFromDb = Optional.ofNullable(driverCacheRepository.findByDriverId(driverId));
        if (driverCacheFromDb.isPresent()) {
            driverCacheFromDb.ifPresent(b -> b.setAvverageReview(driverCache.getAvverageReview()));
            driverCacheFromDb.ifPresent(b -> b.setCurrentLati(driverCache.getCurrentLati()));
            driverCacheFromDb.ifPresent(b -> b.setCurrentLongt(driverCache.getCurrentLongt()));
            driverCacheFromDb.ifPresent(b -> b.setDrive(driverCache.getDrive()));
            driverCacheFromDb.ifPresent(b -> b.setProfileData(driverCache.getProfileData()));
            driverCacheFromDb.ifPresent(b -> b.setRevenueWeekly(driverCache.getRevenueWeekly()));
            driverCacheFromDb.ifPresent(b -> driverCacheRepository.save(b));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteCache(Long driverId) {
        DriverCache dr = driverCacheRepository.findByDriverId(driverId);
        if (dr != null) {
            driverCacheRepository.delete(dr);
            return true;
        } else return false;
    }
}
