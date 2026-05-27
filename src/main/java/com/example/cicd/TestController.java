package com.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/Test")
    public ResponseEntity<List<String>> test() {
        return ResponseEntity.ok(List.of("Hello", "World"));
    }
}
