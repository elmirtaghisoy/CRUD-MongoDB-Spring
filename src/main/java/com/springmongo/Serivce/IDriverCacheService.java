package com.springmongo.Serivce;

import com.springmongo.Entity.DriverCache;

import java.util.List;
import java.util.Optional;

public interface IDriverCacheService {
    List<DriverCache> getAllCache();

    DriverCache getOneCache(Long driverId);

    DriverCache addCache(DriverCache driverCache);

    boolean updateCache(Long driverId, DriverCache driverCache);

    boolean deleteCache(Long driverId);
}
