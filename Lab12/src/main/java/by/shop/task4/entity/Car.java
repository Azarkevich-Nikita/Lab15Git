package by.shop.task4.entity;

public class Car extends Vehicle {
    private int doors;

    public Car(String name, String id, double speed, int doors) {
        super(name, id, speed);
        this.doors = doors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Дверей: " + doors;
    }
}