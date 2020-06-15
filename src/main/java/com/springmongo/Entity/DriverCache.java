package com.springmongo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "driverCache")
public class DriverCache {
    @Id
    @Field("_id")
    @JsonIgnore
    private String id;
    private Long driverId;
    private Long drive;
    private Long profileData;
    private String currentLongt;
    private String currentLati;
    private String revenueWeekly;
    private String avverageReview;

    public DriverCache() {
    }

    public DriverCache(Long driverId, Long drive, Long profileData, String currentLongt, String currentLati, String revenueWeekly, String avverageReview) {
        this.driverId = driverId;
        this.drive = drive;
        this.profileData = profileData;
        this.currentLongt = currentLongt;
        this.currentLati = currentLati;
        this.revenueWeekly = revenueWeekly;
        this.avverageReview = avverageReview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getDrive() {
        return drive;
    }

    public void setDrive(Long drive) {
        this.drive = drive;
    }

    public Long getProfileData() {
        return profileData;
    }

    public void setProfileData(Long profileData) {
        this.profileData = profileData;
    }

    public String getCurrentLongt() {
        return currentLongt;
    }

    public void setCurrentLongt(String currentLongt) {
        this.currentLongt = currentLongt;
    }

    public String getCurrentLati() {
        return currentLati;
    }

    public void setCurrentLati(String currentLati) {
        this.currentLati = currentLati;
    }

    public String getRevenueWeekly() {
        return revenueWeekly;
    }

    public void setRevenueWeekly(String revenueWeekly) {
        this.revenueWeekly = revenueWeekly;
    }

    public String getAvverageReview() {
        return avverageReview;
    }

    public void setAvverageReview(String avverageReview) {
        this.avverageReview = avverageReview;
    }

    @Override
    public String toString() {
        return "DriverCache{" +
                "id=" + id +
                ", drive=" + drive +
                ", profileData=" + profileData +
                ", currentLongt='" + currentLongt + '\'' +
                ", currentLati='" + currentLati + '\'' +
                ", revenueWeekly='" + revenueWeekly + '\'' +
                ", avverageReview='" + avverageReview + '\'' +
                '}';
    }
}
