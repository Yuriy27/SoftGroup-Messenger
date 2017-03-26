package com.softgroup.common.dao.api;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by yuriy on 23.03.17.
 */
@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
