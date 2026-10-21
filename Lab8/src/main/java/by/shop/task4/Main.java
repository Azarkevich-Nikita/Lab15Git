package by.shop.task4;

import by.shop.task4.entity.Animal;
import by.shop.task4.entity.Dog;
import by.shop.task4.entity.Cat;

public class Main {
    static void main() {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Первый", 4, 15.5, "Овчарка");
        animals[1] = new Dog("Второй", 2, 8.2, "Корги");
        animals[2] = new Dog("Третий", 6, 32.0, "Лабрадор");
        animals[3] = new Cat("Четвёртый", 1, 4.1, "Овчарка");
        animals[4] = new Cat("Пятый", 5, 15.4, "Овчарка");

        for (Animal animal : animals) {
            animal.displayInfo();
            System.out.print("Звук: ");
            animal.makeSound();

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fetch();
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.purr();
            }
        }
    }
}

