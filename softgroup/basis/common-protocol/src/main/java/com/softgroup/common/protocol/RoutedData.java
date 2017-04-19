package com.softgroup.common.protocol;

/**
 * Created by yuriy27 on 12.04.17.
 */
public class RoutedData {

    private String profileId;

    private String deviceId;

    public RoutedData(String profileId, String deviceId) {
        this.profileId = profileId;
        this.deviceId = deviceId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
