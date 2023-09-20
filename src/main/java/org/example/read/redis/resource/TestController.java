package org.example.read.redis.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.read.redis.domain.Data;
import org.example.read.redis.service.TestService;

@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestController {

    @Inject
    TestService testService;


    @GET
    @Path("/{id}")
    public void get(@PathParam("id") Long id){
        testService.get(id);
    }

    @POST
    public void post(Data data){
        testService.post(data);
    }

    @PUT
    public void put( Data data){
        testService.post(data);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id){
        testService.delete(id);
    }

}
