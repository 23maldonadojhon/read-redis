package org.example.read.redis.service;

import org.example.read.redis.domain.Data;

public interface TestService {

    public void get(Long id);

    public void post(Data data);

    public void put(Data data);

    public void delete(Long id);

}
