package com.springmongo;

import com.springmongo.Entity.DriverCache;
import com.springmongo.Serivce.IDriverCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Autowired
    IDriverCacheService iDriverCacheService;
    DriverCache driverCache1 = new DriverCache(2L, 1L, 1L, "Bakussssssssssssss", "Gandja", "ok", "ok");
    DriverCache driverCache2 = new DriverCache(2L, 5L, 2L, "Baku2", "Gandja2", "ok2", "ok2");

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

//            GetAllCache
//            System.out.println(iDriverCacheService.getAllCache().toString());
//
//            AddCache
//            System.out.println(iDriverCacheService.addCache(driverCache2));
//
//            GetOneCache
//            System.out.println(iDriverCacheService.getOneCache(2L));

//            DeleteCache
//                System.out.println(iDriverCacheService.deleteCache(2L));

//            UpdateCache
//            System.out.println(iDriverCacheService.updateCache(3L, driverCache2));

        };
    }
}
