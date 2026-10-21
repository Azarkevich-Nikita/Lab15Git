package by.shop.task4.entity;

public class Bicycle implements Movable {
    private String brand;
    private double speed;
    private int gearCount;

    public Bicycle(String brand, double speed, int gearCount) {
        this.brand = brand;
        this.speed = speed;
        this.gearCount = gearCount;
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + brand + " едет со скоростью " + speed + " км/ч на " + gearCount + "-й передаче.");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед " + brand + " остановился.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getGearCount() {
        return gearCount;
    }
}
