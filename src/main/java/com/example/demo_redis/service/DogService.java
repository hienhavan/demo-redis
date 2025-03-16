package com.example.demo_redis.service;

import com.example.demo_redis.api.IStaticApí;
import com.example.demo_redis.dto.DogResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DogService {

    private final IStaticApí staticService;

    public DogService(IStaticApí staticService) {
        this.staticService = staticService;
    }

    @Cacheable(value = "dogs", key = "'list-dog-' + #count")
    public DogResponse getDogs(int count) {
        return staticService.getIDog(count);
    }
}