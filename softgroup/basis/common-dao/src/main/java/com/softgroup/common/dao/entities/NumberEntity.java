package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by yuriy27 on 25.04.17.
 */
@Entity
@Table(name = "numbers")
public class NumberEntity extends BaseEntity implements Serializable {

    @Column(name = "number")
    private String number;

    @ManyToOne
    private ContactEntity contactEntity;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ContactEntity getContactEntity() {
        return contactEntity;
    }

    public void setContactEntity(ContactEntity contactEntity) {
        this.contactEntity = contactEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberEntity that = (NumberEntity) o;

        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        return contactEntity != null ? contactEntity.equals(that.contactEntity) : that.contactEntity == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (contactEntity != null ? contactEntity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NumberEntity{" +
                "number='" + number + '\'' +
                '}';
    }
}
