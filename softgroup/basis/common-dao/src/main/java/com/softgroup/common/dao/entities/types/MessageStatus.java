package com.softgroup.common.dao.entities.types;

/**
 * Created by yuriy27 on 18.04.17.
 */
public enum MessageStatus {

    FORMED(0),
    SENT(1),
    DELIVERED(2),
    VIEWED(3),
    DELETED(4);

    private int id;

    MessageStatus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

