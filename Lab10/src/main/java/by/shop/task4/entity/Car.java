package by.shop.task4.entity;

public class Car implements Movable, Refuelable {
    private String brand;
    private double speed;
    private double fuelLevel;

    public Car(String brand, double speed, double fuelLevel) {
        this.brand = brand;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void move() {
        if (fuelLevel > 0) {
            System.out.println("Автомобиль " + brand + " едет со скоростью " + speed + " км/ч.");
            fuelLevel -= 2.5;
        } else {
            System.out.println("Автомобиль " + brand + " не может ехать. Нет топлива!");
        }
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль " + brand + " остановился.");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Автомобиль " + brand + " заправлен на " + amount + " л. Текущий уровень: " + fuelLevel + " л.");
    }

    @Override
    public double getFuelLevel() {
        return fuelLevel;
    }

    public String getBrand() {
        return brand;
    }
}