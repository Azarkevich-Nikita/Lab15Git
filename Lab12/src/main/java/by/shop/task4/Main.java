package by.shop.task4;

import by.shop.task4.entity.*;

import java.util.*;

public class Main {
    public static void printEmployees(List<Employee> employees, int level) {
        for (Employee emp : employees) {
            if (emp.getLevel() == level) {
                System.out.println(emp);
            }
        }
    }
    static void main() {
        System.out.println("\nЗадание 1:\n");

        Map<String, Vehicle> vehicleMap = new HashMap<>();

        vehicleMap.put("CarOne", new Car("CarOne", "C01", 180, 4));
        vehicleMap.put("CarTwo", new Car("CarTwo", "C02", 200, 2));
        vehicleMap.put("CarThree", new Car("CarThree", "C03", 150, 5));

        vehicleMap.put("TruckOne", new Truck("TruckOne", "T01", 90, 10.5));
        vehicleMap.put("TruckTwo", new Truck("TruckTwo", "T02", 85, 20.0));
        vehicleMap.put("TruckThree", new Truck("TruckThree", "T03", 95, 7.5));

        vehicleMap.put("MotoOne", new Motorcycle("MotoOne", "M01", 120, false));
        vehicleMap.put("MotoTwo", new Motorcycle("MotoTwo", "M02", 100, true));

        for (Map.Entry<String, Vehicle> entry : vehicleMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значение: [" + entry.getValue() + "]");
        }

        System.out.println("\nЗадание 2:\n");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E01", "Иван", "IT", 1, Arrays.asList(5, 4, 5)));
        employees.add(new Employee("E02", "Анна", "HR", 2, Arrays.asList(3, 2, 3)));
        employees.add(new Employee("E03", "Петр", "IT", 3, Arrays.asList(4, 4, 4)));
        employees.add(new Employee("E04", "Ольга", "Sales", 1, Arrays.asList(2, 2, 1)));
        employees.add(new Employee("E05", "Сергей", "IT", 2, Arrays.asList(5, 5, 5)));
        employees.add(new Employee("E06", "Мария", "Sales", 2, Arrays.asList(4, 3, 4)));

        System.out.println("Исходный список сотрудников");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getAveragePerformance() < 3.0) {
                iterator.remove();
            }
        }

        for (Employee emp : employees) {
            if (emp.getAveragePerformance() >= 4.0) {
                emp.setLevel(emp.getLevel() + 1);
            }
        }

        System.out.println("\nСотрудники на уровне 2 после изменений ");
        printEmployees(employees, 2);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int scoreCompare = Double.compare(e2.getAveragePerformance(), e1.getAveragePerformance());
                if (scoreCompare != 0) {
                    return scoreCompare;
                }
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("\nУпорядоченный список (убывание балла, затем по алфавиту) ");
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Имя: " + emp.getName() + ", Средний балл: " + String.format("%.2f", emp.getAveragePerformance()));
        }
    }
}
