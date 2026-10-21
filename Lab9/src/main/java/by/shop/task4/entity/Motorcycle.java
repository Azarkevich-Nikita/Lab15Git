package by.shop.task4.entity;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, double speed, boolean hasSidecar) {
        super(brand, year, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() { return hasSidecar; }
    public void setHasSidecar(boolean hasSidecar) { this.hasSidecar = hasSidecar; }

    @Override
    public void move() {
        System.out.println("Результат движения: Едет по дороге (Мотоцикл).");
    }

    @Override
    public void fuelConsumption() {
        System.out.println("Расход топлива: 4 л/100 км.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Наличие коляски: " + (hasSidecar ? "Да" : "Нет") + " | ");
    }
}