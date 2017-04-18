package com.softgroup.common.dao.entities.types;

/**
 * Created by yuriy27 on 18.04.17.
 */
public enum ConversationType {

    INDIVIDUAL(0),
    GROUP(1);

    private int id;

    ConversationType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
