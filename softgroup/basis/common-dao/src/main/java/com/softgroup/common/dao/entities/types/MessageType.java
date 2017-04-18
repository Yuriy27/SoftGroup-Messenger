package com.softgroup.common.dao.entities.types;

/**
 * Created by yuriy27 on 18.04.17.
 */
public enum MessageType {

    TEXT(0),
    IMAGE(1),
    VIDEO(2),
    AUDIO(3),
    LINK(4),
    GEOLOCATION(5),
    CONTACT(6),
    STICKER(7);

    private int id;

    MessageType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
