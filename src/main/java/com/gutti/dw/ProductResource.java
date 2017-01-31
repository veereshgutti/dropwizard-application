package com.gutti.dw;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Veeresh Gutti on 31/12/15.
 */

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductResource {
    ProductsDao productsDao = new ProductsDao();

    @GET
    public Response getProducts() {
            return Response.ok().entity(productsDao.getProducts()).build();
    }

    @Path("/{pid}")
    @GET
    public Response getProduct(@PathParam("pid") String pid) {
        return Response.ok().entity(productsDao.getProduct(pid)).build();
    }

    @POST
    public  Response createProduct(Product product, @Context HttpServletRequest request) throws URISyntaxException {
        productsDao.createProduct(product);
        return Response.created(new URI(product.getPid())).build();
    }

    @PUT
    public  Response updateProduct(Product product, @Context HttpServletRequest request) throws URISyntaxException {
        productsDao.updateProduct(product);
        return Response.created(new URI(product.getPid())).build();
    }
}
