package by.shop.task4.entity;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Порода: " + breed);
    }

    public void fetch() {
        System.out.println(getName() + " дал лапу");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}

