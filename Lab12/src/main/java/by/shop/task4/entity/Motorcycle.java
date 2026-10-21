package by.shop.task4.entity;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String name, String id, double speed, boolean hasSidecar) {
        super(name, id, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Коляска: " + (hasSidecar ? "Да" : "Нет");
    }
}