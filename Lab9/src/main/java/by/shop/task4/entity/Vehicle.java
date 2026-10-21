package by.shop.task4.entity;

public abstract class Vehicle {
    private String brand;
    private int year;
    private double speed;

    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public abstract void move();
    public abstract void fuelConsumption();

    public void displayInfo() {
        System.out.print("Марка: " + brand + ", Год выпуска: " + year + ", Скорость: " + speed + " км/ч");
    }
}