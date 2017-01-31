package com.gutti.dw;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ramkumar S on 23-07-2014.
 */
//@XmlRootElement
public class ErrorResponse {
    private int status;
    private String message;
    private String code;
    private String resource;

    public ErrorResponse(int status, String code, String message, String resource) {
        this.status = status;
        this.code = code;
        this.message = message;
        this.resource = resource;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}
