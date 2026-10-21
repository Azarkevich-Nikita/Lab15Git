package by.shop.task4;

import by.shop.task4.entity.Bicycle;
import by.shop.task4.entity.Car;
import by.shop.task4.entity.Movable;
import by.shop.task4.entity.Refuelable;

public class Main {
    static void main() {
        Movable[] fleet = new Movable[5];
        fleet[0] = new Car("Tesla Model S", 120, 0);
        fleet[1] = new Car("Geely Atlas", 90, 15);
        fleet[2] = new Car("Audi A4", 140, 40);
        fleet[3] = new Bicycle("Aist", 20, 7);
        fleet[4] = new Bicycle("Trek", 25, 21);

        for (Movable vehicle : fleet) {
            vehicle.move();

            if (vehicle instanceof Refuelable) {
                Refuelable refuelableCar = (Refuelable) vehicle;
                if (refuelableCar.getFuelLevel() <= 0) {
                    refuelableCar.refuel(30.0);
                    vehicle.move();
                }
            }

            vehicle.stop();
            System.out.println();
        }
    }
}
