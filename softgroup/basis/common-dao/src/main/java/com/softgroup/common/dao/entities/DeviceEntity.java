package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuriy27 on 01.05.17.
 */
@Entity
@Table(name = "devices")
public class DeviceEntity extends BaseEntity {

    @Column(name = "device_id")
    private String deviceId;

    @Column(name = "locale_code")
    private String localeCode;

}
