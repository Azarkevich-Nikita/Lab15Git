package by.shop.task4.entity;

public class Animal {
    private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Животное издает неопределенный звук");
    }

    public void displayInfo() {
        System.out.print("Кличка: " + name + ", Возраст: " + age + " лет, Вес: " + weight + " кг");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }
}

