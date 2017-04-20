package com.softgroup.profile.impl.handler;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.profile.api.message.ContactsSyncRequest;
import com.softgroup.profile.api.message.ContactsSyncResponse;
import com.softgroup.profile.api.router.ProfileRequestHandler;

/**
 * Created by yuriy27 on 20.04.17.
 */
public class ContactsSyncHandler
        extends AbstractRequestHandler<ContactsSyncRequest, ContactsSyncResponse>
        implements ProfileRequestHandler {
    @Override
    public String getName() {
        return "contacts_sync";
    }

    @Override
    public Response<ContactsSyncResponse> doHandle(Request<ContactsSyncRequest> msg) {

        return null;
    }
}
