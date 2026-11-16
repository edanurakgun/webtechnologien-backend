package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Travelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ziel;
    private String startDatum;
    private String endDatum;
    private boolean status;
    private String owner;

    public Travelling() {}

    public Travelling(String ziel, String startDatum, String endDatum, boolean status, String owner) {
        this.ziel = ziel;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.status = status;
        this.owner = owner;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getZiel() {
        return ziel;
    }

    public void setZiel(String ziel) {
        this.ziel = ziel;
    }

    public String getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(String startDatum) {
        this.startDatum = startDatum;
    }

    public String getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(String endDatum) {
        this.endDatum = endDatum;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getOwner() { return owner; }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
