package com.rds.app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyRestApi {

    @GetMapping
    public Map<String, String> get() {
        return Map.of("message", "Hello, World!",
                       "status", "success",
                "timestamp", String.valueOf(System.currentTimeMillis()),
                "version", "1.0.0",
                "description", "Sample REST API");
    }


}
