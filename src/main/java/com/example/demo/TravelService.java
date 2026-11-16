package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {
    @Autowired
    TravelRepository repo;

    public Travelling save(Travelling travelling) {
        return repo.save(travelling);
    }

    public Travelling get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Travelling> getAllWithoutOwner() {
        Iterable<Travelling> iterator = repo.findAll();
        List<Travelling> travellings = new ArrayList<Travelling>();
        for (Travelling travelling : iterator) if(travelling.getOwner()==null || travelling.getOwner().equals("")) travellings.add(travelling);
        return travellings;
    }

    public List<Travelling> getAllOwnedBy(String owner) {
        Iterable<Travelling> iterator = repo.findAll();
        List<Travelling> travellings = new ArrayList<Travelling>();
        for (Travelling travelling : iterator) if(travelling.getOwner()!=null && travelling.getOwner().equals(owner)) travellings.add(travelling);
        return travellings;
    }

}
