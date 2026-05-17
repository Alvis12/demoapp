package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class VisitController {

    private final AtomicInteger count = new AtomicInteger(0);

    @GetMapping("/api/visits")
    public Map<String, Integer> visits() {
        return Map.of("count", count.incrementAndGet());
    }
}