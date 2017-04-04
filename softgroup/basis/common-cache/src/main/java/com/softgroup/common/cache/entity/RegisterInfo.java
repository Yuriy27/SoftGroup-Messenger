package com.softgroup.common.cache.entity;

/**
 * Created by yuriy27 on 04.04.17.
 */
public class RegisterInfo {

    private String registrationRequestUuid;

    private Long registrationTimeOutSec;

    private String authCode;

    private String phoneNumber;

    private String localeCode;

    private String deviceId;

    public String getRegistrationRequestUuid() {
        return registrationRequestUuid;
    }

    public void setRegistrationRequestUuid(String registrationRequestUuid) {
        this.registrationRequestUuid = registrationRequestUuid;
    }

    public Long getRegistrationTimeOutSec() {
        return registrationTimeOutSec;
    }

    public void setRegistrationTimeOutSec(Long registrationTimeOutSec) {
        this.registrationTimeOutSec = registrationTimeOutSec;
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
                "registrationRequestUuid='" + registrationRequestUuid + '\'' +
                ", registrationTimeOutSec=" + registrationTimeOutSec +
                ", authCode='" + authCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", localeCode='" + localeCode + '\'' +
                ", deviceId='" + deviceId + '\'' +
                '}';
    }
}
