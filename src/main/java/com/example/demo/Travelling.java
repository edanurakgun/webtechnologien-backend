package com.example.demo;

public class Travelling {
    private Long id;
    private String ziel;
    private String startDatum;
    private String endDatum;
    private boolean status;

    public Travelling(Long id, String ziel, String startDatum, String endDatum, boolean status) {
        this.id = id;
        this.ziel = ziel;
        this.startDatum = startDatum;
        this.endDatum = endDatum;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
