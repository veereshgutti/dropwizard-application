package com.gutti.dw;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import static javax.ws.rs.core.Response.Status.NOT_FOUND;

/**
 * Created by Veeresh Gutti on 2/1/16.
 */
public class ResourceNotFoundExceptionHandler implements ExceptionMapper<ResourceNotFoundException> {
    @Override
    public Response toResponse(ResourceNotFoundException exception) {
        return Response.status(NOT_FOUND).type(MediaType.APPLICATION_JSON_TYPE)
                .entity(new ErrorResponse(NOT_FOUND.getStatusCode(), exception.getCode(), exception.getMessage(), exception.getResource()))
                .build();
    }
}
