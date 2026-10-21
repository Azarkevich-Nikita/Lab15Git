package by.shop.task4;

import by.shop.task4.entity.Car;

public class Main {
    static void main() {
        Car car1 = new Car("BMW M5", 2023, 600);
        Car car2 = new Car("Audi RS6", 2022, 600);
        Car car3 = new Car("Lada Granta", 2024, 90);
        Car car4 = new Car("Toyota Camry", 2021, 200);
        Car car5 = new Car("Tesla Model S", 2023, 670);

        System.out.println("Всего создано автомобилей: " + Car.getTotalCars());
        System.out.println("Общая мощность всех авто: " + Car.getTotalHorsePower() + " л.с.");
        System.out.println("Средняя мощность одного автомобиля: " + Car.getAveragePower() + " л.с.");
    }
}
