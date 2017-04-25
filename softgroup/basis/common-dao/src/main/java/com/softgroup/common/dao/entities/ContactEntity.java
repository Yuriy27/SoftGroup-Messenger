package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yuriy27 on 20.04.17.
 */
@Entity
@Table(name = "contacts")
public class ContactEntity extends BaseEntity implements Serializable {

    @Column(name = "profile_id")
    private String profileId;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "contact_id")
    private Set<NumberEntity> phoneNumbers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<NumberEntity> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<NumberEntity> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactEntity that = (ContactEntity) o;

        if (profileId != null ? !profileId.equals(that.profileId) : that.profileId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return phoneNumbers != null ? phoneNumbers.equals(that.phoneNumbers) : that.phoneNumbers == null;
    }

    @Override
    public int hashCode() {
        int result = profileId != null ? profileId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (phoneNumbers != null ? phoneNumbers.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ContactEntity{" +
                "profileId='" + profileId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
