package org.example.read.redis.service;

import io.quarkus.redis.client.RedisClient;
import io.smallrye.mutiny.Uni;

import io.vertx.mutiny.redis.client.RedisAPI;
import io.vertx.mutiny.redis.client.Response;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class RedisService {


    @Inject
    RedisAPI redisAPI;

    public Uni<Response> getString(String key){
        return redisAPI.get(key);
    }

}
