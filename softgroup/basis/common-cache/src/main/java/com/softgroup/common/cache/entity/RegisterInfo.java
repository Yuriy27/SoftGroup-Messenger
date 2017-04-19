package com.softgroup.common.cache.entity;

/**
 * Created by yuriy27 on 04.04.17.
 */
public class RegisterInfo {

    private String authCode;

    private String phoneNumber;

    private String localeCode;

    private String deviceId;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public String toString() {
        return "RegisterInfo{" +
                ", authCode='" + authCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", localeCode='" + localeCode + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
