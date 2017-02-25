package com.softgroup.authorization.api.message;

import com.softgroup.common.protocol.ResponseData;

/**
 * @author odin
 * @since 20.02.17.
 */
public class RegisterResponse implements ResponseData {

	private static final long serialVersionUID = -5146888202653750948L;

	private String registrationRequestUuid;

	private Integer registrationTimeoutSec;

	public String getRegistrationRequestUuid() {
		return registrationRequestUuid;
	}

	public void setRegistrationRequestUuid(String registrationRequestUuid) {
		this.registrationRequestUuid = registrationRequestUuid;
	}

	public Integer getRegistrationTimeoutSec() {
		return registrationTimeoutSec;
	}

	public void setRegistrationTimeoutSec(Integer registrationTimeoutSec) {
		this.registrationTimeoutSec = registrationTimeoutSec;
	}
}
