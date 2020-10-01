package com.company;

public class MediumCar extends BasicCar {
    private final BasicCar car;
    private String size;

    public MediumCar(BasicCar car, String size) {
        this.car = car;
        this.size=size;
    }

    @Override
    public int getId() {
        return car.getId();
    }

    @Override
    public void setId(int id) {
        car.setId(id);
    }

    @Override
    public String getName() {
        return car.getName();
    }

    @Override
    public void setName(String name) {
        car.setName(name);
    }

    @Override
    public double getEngine() {
        return car.getEngine();
    }

    @Override
    public void setEngine(double engine) {
        car.setEngine(engine);
    }

    @Override
    public void info() {
        System.out.println("Size = " + size);

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
