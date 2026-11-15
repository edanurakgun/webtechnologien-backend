package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {
    @GetMapping("/")
    public List<Travelling> index() {
        return List.of(new Travelling(1L, "Berlin", "01.10.2026", "15.10.2026", true),
                new Travelling(2L, "Paris", "22.10.2026", "25.10.2026", false),
                new Travelling(3L, "Rom", "03.11.2026", "10.11.2026", false));
    }
}
