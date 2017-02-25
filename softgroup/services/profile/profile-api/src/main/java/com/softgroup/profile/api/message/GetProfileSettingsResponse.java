package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.ResponseData;
import com.softgroup.profile.api.message.model.ProfileSettings;

/**
 * Created by yuriy on 24.02.17.
 */
public class GetProfileSettingsResponse implements ResponseData {

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
