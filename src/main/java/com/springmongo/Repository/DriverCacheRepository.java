package com.springmongo.Repository;

import com.springmongo.Entity.DriverCache;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverCacheRepository extends MongoRepository<DriverCache, String> {

    DriverCache findByDriverId(Long driverId);

}
