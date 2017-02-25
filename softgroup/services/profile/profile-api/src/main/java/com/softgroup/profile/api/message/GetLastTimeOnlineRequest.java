package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;

import java.util.List;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetLastTimeOnlineRequest implements RequestData {

    private List<String> profiles; //uuid

    public List<String> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<String> profiles) {
        this.profiles = profiles;
    }
}
