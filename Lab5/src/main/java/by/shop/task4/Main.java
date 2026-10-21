package by.shop.task4;

import by.shop.task4.entity.Book;
import by.shop.task4.entity.DayOfWeek;
import by.shop.task4.entity.Student;

public class Main {
    static void main() {
        Book book1 = new Book("None", "Nikita", 2025);
        Book book2 = new Book("First", "No info", 1019);

        System.out.println("Старше 50?\nКнига 1: " + book1.isOld() + "\nКнига 2: " + book2.isOld());

        Student[] students = {
                new Student("Nikita", 9.9, "T-392"),
                new Student("Vlad", 7.2, "B-391"),
                new Student("Oleg", 4.6, "T-393"),
                new Student("Egor", 6.3, "T-391"),
                new Student("Ivan", 9.6, "T-393"),
                new Student("Slava", 9.6, "T-391"),
                new Student("Nikita", 9.5, "T-391")
        };

        System.out.println("Средняя оценка: " + Student.averageGrade(students));
        System.out.println("Максимальная оценка: : " + Student.maxGrade(students));

        for (DayOfWeek day : DayOfWeek.values()) {
            String type = day.isWeekend() ? "выходной" : "рабочий";
            System.out.println(day + " — " + type);
        }
    }
}
