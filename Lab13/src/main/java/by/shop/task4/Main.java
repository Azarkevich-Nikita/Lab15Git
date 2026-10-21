package by.shop.task4;

import by.shop.task4.entity.Student;
import by.shop.task4.exception.GradeUpdateException;
import by.shop.task4.exception.InvalidStudentDataException;
import by.shop.task4.exception.StudentNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Student> studentList = new ArrayList<>();

    public static Student findStudent(String name) throws StudentNotFoundException {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        throw new StudentNotFoundException("Студент не найден в базе данных", name);
    }

    static void main() {
        try {
            studentList.add(new Student("Иван Иванов", 19, 4, "ПОИС-24"));
            studentList.add(new Student("Анна Петрова", 15, 5, "ПОИС-24"));
        } catch (InvalidStudentDataException e) {
            System.out.println("Перехвачена ошибка данных студента: " + e.getMessage());
        }

        try {
            Student s = findStudent("Сидоров Олег");
        } catch (StudentNotFoundException e) {
            System.out.println("Перехвачена ошибка поиска: " + e.getMessage() + " [Имя: " + e.getStudentName() + "]");
        }

        try {
            Student ivan = findStudent("Иван Иванов");
            ivan.updateGrade(4);
        } catch (StudentNotFoundException | GradeUpdateException e) {
            System.out.println("Перехвачена ошибка операции: " + e.getMessage());
        }

        try {
            Student ivan = findStudent("Иван Иванов");
            ivan.updateGrade(5);
            ivan.promote();
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Все проверки вариантов исключений завершены.");
        }
    }
}
