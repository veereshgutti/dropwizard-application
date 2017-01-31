package com.gutti.dw;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Veeresh Gutti on 28/12/15.
 */
@Path("/retailers")
@Produces(MediaType.APPLICATION_JSON)

@Consumes(MediaType.APPLICATION_JSON)
public class RetailerResource {
    RetailerDao retailerDao = new RetailerDao();
    ProductResource productResource = new ProductResource();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRetailers() {
        return Response.ok().entity(retailerDao.getRetailers()).build();
    }

    @Path("/{rid}")
    @GET
    public Response getRetailer(@PathParam("rid") String rid) {
        return Response.ok().entity(retailerDao.getRetailer(rid)).build();
    }

    @Path("/{rid}")
    @DELETE
    public Response deleteRetailer(@PathParam("rid") String rid) {
        retailerDao.deleteRetailer(rid);
        return Response.ok().build();
    }

    @POST
    public  Response createRetailer(Retailer retailer,@Context HttpServletRequest request) throws URISyntaxException {
        retailerDao.createRetailer(retailer);
        return Response.created(new URI(retailer.getrId())).build();
    }

    @PUT
    public  Response UpdateRetailer(Retailer retailer){
            retailerDao.updateRetailer(retailer);
            return Response.status(204).build();
    }

    @Path("{rid}/products")
    public ProductResource getProductResource(){
        return productResource;
    }
}
