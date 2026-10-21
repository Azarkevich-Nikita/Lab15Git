package by.shop.task4.entity;

public class Car {
    private String model;
    private int year;
    private int horsePower;

    private static int totalCars = 0;
    private static int totalHorsePower = 0;

    public Car() {
        this.model = "None";
        this.year = 2026;
        this.horsePower = 0;

        totalCars++;
        totalHorsePower += this.horsePower;
    }

    public Car(String model) {
        this.model = model;
        this.year = 2026;
        this.horsePower = 0;

        totalCars++;
        totalHorsePower += this.horsePower;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.horsePower = 0;

        totalCars++;
        totalHorsePower += this.horsePower;
    }

    public Car(String model, int year, int horsePower) {
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;

        totalCars++;
        totalHorsePower += this.horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        totalHorsePower = totalHorsePower - this.horsePower + horsePower;
        this.horsePower = horsePower;
    }

    public static int getTotalCars() {
        return totalCars;
    }

    public static int getTotalHorsePower() {
        return totalHorsePower;
    }

    public static double getAveragePower() {
        if (totalCars == 0) {
            return 0.0;
        }
        return (double) totalHorsePower / totalCars;
    }

    @Override
    public String toString() {
        return "Модель: " + this.model + ", Год:" + this.year + ", Сил:" + this.horsePower + "\n";
    }
}
