package com.example.demo_redis.api;

import com.example.demo_redis.api.impl.StaticApi;
import com.example.demo_redis.config.FeignConfig;
import com.example.demo_redis.dto.DogResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dogService", url = "https://dog.ceo/api",
        configuration = FeignConfig.class, fallback = StaticApi.class)
public interface IStaticApí {

    @GetMapping("/breeds/image/random/{count}")
    DogResponse getIDog(@PathVariable("count") int count);
}