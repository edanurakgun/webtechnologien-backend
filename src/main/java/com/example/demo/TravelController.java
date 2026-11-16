package com.example.demo;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class TravelController {

    @Autowired
    TravelService service;

    Logger logger = LoggerFactory.getLogger(TravelController.class);

    @GetMapping("/")
    public List<Travelling> index() {
        return List.of(new Travelling(1L, "Berlin", "01.10.2026", "15.10.2026", true),
                new Travelling(2L, "Paris", "22.10.2026", "25.10.2026", false),
                new Travelling(3L, "Rom", "03.11.2026", "10.11.2026", false));
    }

    @PostMapping("/travellings")
    public Travelling createTravelling(@RequestBody Travelling travelling) {
        return service.save(travelling);
    }

    @GetMapping("/travellings/{id}")
    public Travelling getTravelling(@PathVariable String id) {
        logger.info("GET request on route things with {}", id);
        Long travellingId = Long.parseLong(id);
        return service.get(travellingId);
    }

    @GetMapping("/travellings")
    public List<Travelling> getAllTravellings(@RequestParam("owner") String owner) {
        return owner.equals("") ? service.getAllWithoutOwner() : service.getAllOwnedBy(owner);
    }

}
