package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by yuriy27 on 01.05.17.
 */
@Entity
@Table(name = "conversation_settings")
public class ConversationSettingsEntity extends BaseEntity {

    @Column(name = "admin_id")
    private String adminId;

    @Column(name = "name")
    private String name;

    @Column(name = "logo_image_uri")
    private String logoImageUri;

}
