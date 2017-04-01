package com.softgroup.common.token.api;

/**
 * Created by yuriy on 29.03.17.
 */
public enum TokenType {

    TEMPORARY,
    PERMANENT;

    public Long getLivingTime() {
        switch (this) {
            case PERMANENT: return 1000l * 3600 * 24 * 365;
            case TEMPORARY: return 1000l * 60 * 15;
            default: return 0l;
        }
    }

}
