package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.message.model.Profile;

/**
 * Created by yuriy on 24.02.17.
 */
public class SetMyProfileRequest implements RequestData {

    private Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
