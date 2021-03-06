package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.model.ProfileSettings;

import java.util.List;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetLastTimeOnlineResponse implements ResponseData {

    private List<ProfileSettings> profiles;

    public List<ProfileSettings> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<ProfileSettings> profiles) {
        this.profiles = profiles;
    }
}
