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
        return List.of(new Travelling("Berlin", "01.10.2026", "15.10.2026", true, "Eda"),
                new Travelling("Paris", "22.10.2026", "25.10.2026", false, "Eda"),
                new Travelling("Rom", "03.11.2026", "10.11.2026", false, "Yuliya"));
    }

    @PostMapping("/travellings")
    public Travelling createTravelling(@RequestBody Travelling travelling) {
        return service.save(travelling);
    }

    @GetMapping("/travellings/{id}")
    public Travelling getTravelling(@PathVariable String id) {
        logger.info("GET request on route travellings with {}", id);
        Long travellingId = Long.parseLong(id);
        return service.get(travellingId);
    }

    @GetMapping("/travellings")
    public List<Travelling> getAllTravellings(@RequestParam("owner") String owner) {
        return owner.equals("") ? service.getAllWithoutOwner() : service.getAllOwnedBy(owner);
    }

}
