package com.softgroup.common.protocol;

/**
 * Created by yuriy27 on 18.04.17.
 */
public enum Statuses {

    SUCCESS(200, "Ok"),
    BAD_REQUEST(400, "Bad request"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not found"),
    NOT_ACCEPTABLE(406, "Not acceptable"),
    UNPROCESSABLE_ENTITY(422, "Unprocessable entity"),
    TOO_MANY_REQUESTS(429, "Too many requests"),
    SERVER_ERROR(500, "Internal server error"),
    NOT_IMPLEMENTED(501, "Not implemented");

    private int code;

    private String message;

    Statuses(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
