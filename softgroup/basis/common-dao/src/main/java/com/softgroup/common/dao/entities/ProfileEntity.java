package com.softgroup.common.dao.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by yuriy on 19.03.17.
 */
@Entity
@Table(name = "profiles")
public class ProfileEntity implements Serializable {

    private static final long serialVersionUID = 2645460488213358603L;

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "create_date_time")
    private Long createDateTime;

    @Column(name = "update_date_time")
    private Long updateDateTime;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "avatar_uri")
    private String avatarUri;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "profile")
    private List<ProfileSettingsEntity> settingsEntities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Long createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Long getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(Long updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvatarUri() {
        return avatarUri;
    }

    public void setAvatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
    }

    public List<ProfileSettingsEntity> getSettingsEntities() {
        return settingsEntities;
    }

    public void setSettingsEntities(List<ProfileSettingsEntity> settingsEntities) {
        this.settingsEntities = settingsEntities;
    }

}
