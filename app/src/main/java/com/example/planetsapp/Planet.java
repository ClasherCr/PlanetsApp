package com.example.planetsapp;

//this class is acting as model class for our listview
public class Planet {

    //attributes
    private String planetname;
    private String mooncount;

    private int planetimage;

    // constructor
    public Planet(String planetname, String mooncount, int planetimage) {
        this.planetname = planetname;
        this.mooncount = mooncount;
        this.planetimage = planetimage;
    }

    // getter n setter
    public String getPlanetname() {
        return planetname;
    }

    public void setPlanetname(String planetname) {
        this.planetname = planetname;
    }

    public String getMooncount() {
        return mooncount;
    }

    public void setMooncount(String mooncount) {
        this.mooncount = mooncount;
    }

    public int getPlanetimage() {
        return planetimage;
    }

    public void setPlanetimage(int planetimage) {
        this.planetimage = planetimage;
    }
}
