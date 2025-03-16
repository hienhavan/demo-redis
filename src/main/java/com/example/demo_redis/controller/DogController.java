package com.example.demo_redis.controller;

import com.example.demo_redis.dto.DogResponse;
import com.example.demo_redis.service.DogService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/{count}")
    public DogResponse getDogs(@PathVariable int count) {
        return dogService.getDogs(count);
    }
}