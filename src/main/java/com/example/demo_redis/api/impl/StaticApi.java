package com.example.demo_redis.api.impl;

import com.example.demo_redis.api.IStaticApí;
import com.example.demo_redis.dto.DogResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StaticApi implements IStaticApí {

    @Override
    public DogResponse getIDog(int count) {
        log.error("Static service is slow");
        throw new RuntimeException("Fallback: Cannot fetch dog image");    }
}

