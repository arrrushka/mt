package com.company;

public class BigCar extends BasicCar {
    private String size;
    private BasicCar car;

    public BigCar(BasicCar internal, String size) {
        this.car = internal;
        this.size = size;
    }

    @Override
    public void info() {
        System.out.println("Car size = " + size);
        car.info();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BasicCar getInternal() {
        return car;
    }

    public void setInternal(BasicCar internal) {
        this.car = internal;
    }
}
