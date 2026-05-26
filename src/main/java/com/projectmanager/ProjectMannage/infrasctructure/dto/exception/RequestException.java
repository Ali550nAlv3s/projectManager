package com.projectmanager.ProjectMannage.infrasctructure.dto.exception;

import lombok.Getter;

@Getter
public class RequestException extends RuntimeException {
    public final String errorcode;

    public RequestException(String message, String errorCode) {
        super(message);
        this.errorcode = errorCode;
    }
}
