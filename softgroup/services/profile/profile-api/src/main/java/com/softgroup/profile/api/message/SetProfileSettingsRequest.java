package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.model.ProfileSettings;

/**
 * Created by yuriy on 24.02.17.
 */
public class SetProfileSettingsRequest implements RequestData {

    private ProfileSettings settings;

    public ProfileSettings getSettings() {
        return settings;
    }

    public void setSettings(ProfileSettings settings) {
        this.settings = settings;
    }
}
