package org.example.read.redis.resource;


import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.example.read.redis.service.RedisService;

@Path("/data")
public class DataResource {

    @Inject
    RedisService redisService;

    @GET
    public void get(){
        redisService.getString("MI_CLAVE1")
                .subscribe()
                .with(System.out::println);
    }

}
