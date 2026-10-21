package by.shop.task4.entity;

public class Truck extends Vehicle {
    private double capacity;

    public Truck(String name, String id, double speed, double capacity) {
        super(name, id, speed);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Грузоподъемность: " + capacity + " т";
    }
}