package com.softgroup.profile.api.message;

import com.softgroup.common.protocol.RequestData;
import com.softgroup.profile.api.dto.ContactDto;

import java.util.List;

/**
 * Created by yuriy on 24.02.17.
 */
public class ContactsSyncRequest implements RequestData {

    private List<ContactDto> addedContactDtos;

    private List<ContactDto> removedContactDtos;

    public List<ContactDto> getAddedContactDtos() {
        return addedContactDtos;
    }

    public void setAddedContactDtos(List<ContactDto> addedContactDtos) {
        this.addedContactDtos = addedContactDtos;
    }

    public List<ContactDto> getRemovedContactDtos() {
        return removedContactDtos;
    }

    public void setRemovedContactDtos(List<ContactDto> removedContactDtos) {
        this.removedContactDtos = removedContactDtos;
    }
}
