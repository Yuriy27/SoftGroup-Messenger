package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetOtherProfilesRequest implements RequestData {

    private List<Long> userId;

    public List<Long> getUserId() {
        return userId;
    }

    public void setUserId(List<Long> userId) {
        this.userId = userId;
    }
}
