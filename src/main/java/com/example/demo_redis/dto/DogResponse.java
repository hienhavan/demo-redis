package com.example.demo_redis.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class DogResponse {
    private List<String> message;
    private String status;
}
