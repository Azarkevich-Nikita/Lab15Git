package by.shop.task4.entity;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу мяу");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Цвет: " + color);
    }

    public void purr() {
        System.out.println(getName() + " мурлычет");
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}
