package com.maverickallies.planetsapp;

public class Planet {

    //Attributes
    private String name;
    private String moonCount;

    private int planetImage;

    public Planet(String name, String moonCount, int planetImage) {
        this.name = name;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
