package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {
    @GetMapping("/")
    public List<Travelling> index() {
        return List.of(new Travelling("M1"),new Travelling("M2"),new Travelling("M3"),new Travelling("M4"));
    }
}
