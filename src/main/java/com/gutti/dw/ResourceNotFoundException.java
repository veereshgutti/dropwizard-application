package com.gutti.dw;

/**
 * Created by Veeresh Gutti on 2/1/16.
 */
public class ResourceNotFoundException extends RuntimeException {
    private String code;
    private String resource;
    private String message;

    public ResourceNotFoundException(String code, String resource, String message) {
        super(code + ": " + resource);
        this.code = code;
        this.resource = resource;
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

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
