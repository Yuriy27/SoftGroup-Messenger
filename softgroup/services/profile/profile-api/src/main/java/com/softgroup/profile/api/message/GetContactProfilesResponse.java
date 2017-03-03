package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.model.Profile;

import java.util.List;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetContactProfilesResponse implements ResponseData {

    private List<Profile> profiles;

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}
