package com.company;

public class BasicCar {
    private int id;
    private String name;
    private double engine;
    public BasicCar() {
    }

    public BasicCar(int id, String name, double engine) {
        this.id = id;
        this.name = name;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engineVolume) {
        this.engine = engine;
    }

    public void info() {
        System.out.println("id = " + id + "name" + name + "engine volume" + engine);
    }
}
