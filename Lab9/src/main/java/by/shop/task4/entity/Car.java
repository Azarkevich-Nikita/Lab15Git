package by.shop.task4.entity;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, double speed, int doors) {
        super(brand, year, speed);
        this.doors = doors;
    }

    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }

    @Override
    public void move() {
        System.out.println("Результат движения: Едет по дороге (Автомобиль).");
    }

    @Override
    public void fuelConsumption() {
        System.out.println("Расход топлива: 8 л/100 км.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Количество дверей: " + doors + " | ");
    }
}
