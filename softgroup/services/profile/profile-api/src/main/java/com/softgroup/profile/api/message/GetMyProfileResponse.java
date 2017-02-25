package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.message.model.Profile;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetMyProfileResponse implements ResponseData {

    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
