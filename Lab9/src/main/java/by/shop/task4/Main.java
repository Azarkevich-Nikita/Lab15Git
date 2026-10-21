package by.shop.task4;

import by.shop.task4.entity.Car;
import by.shop.task4.entity.Motorcycle;
import by.shop.task4.entity.Vehicle;

public class Main {
    static void main() {
        Vehicle[] garage = new Vehicle[5];

        garage[0] = new Car("BMW M5", 2023, 250, 4);
        garage[1] = new Car("Audi A6", 2021, 240, 4);
        garage[2] = new Car("MINI Cooper", 2022, 220, 3);
        garage[3] = new Motorcycle("Yamaha R6", 2023, 210, true);
        garage[4] = new Motorcycle("Yamaha R1", 2024, 299, false);

        System.out.println("Транспортные средства");
        for (Vehicle transport : garage) {
            transport.displayInfo();
            transport.fuelConsumption();
            transport.move();
            System.out.println();
        }
    }
}
