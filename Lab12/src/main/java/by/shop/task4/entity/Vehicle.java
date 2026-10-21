package by.shop.task4.entity;

public abstract class Vehicle {
    private String name;
    private String id;
    private double speed;

    public Vehicle(String name, String id, double speed) {
        this.name = name;
        this.id = id;
        this.speed = speed;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public double getSpeed() { return speed; }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Скорость: " + speed + " км/ч";
    }
}