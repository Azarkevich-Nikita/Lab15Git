package by.shop.task4.entity;

import by.shop.task4.exception.GradeUpdateException;
import by.shop.task4.exception.InvalidStudentDataException;

public class Student {
    private final String name;
    private final int age;
    private int grade;
    private final String group;

    public Student(String name, int age, int grade, String group) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidStudentDataException("Имя студента не может быть пустым");
        }
        if (age < 16 || age > 60) {
            throw new InvalidStudentDataException("Недопустимый возраст: " + age + ".");
        }
        if (grade < 1 || grade > 5) {
            throw new InvalidStudentDataException("Недопустимая оценка: " + grade + ".");
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.group = group;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public int getGrade() { return grade; }
    public String getGroup() { return group; }

    public void updateGrade(int newGrade) throws GradeUpdateException {
        if (newGrade < 1 || newGrade > 5) {
            throw new GradeUpdateException("Ошибка обновления: оценка " + newGrade + " выходит за рамки");
        }
        if (newGrade == this.grade) {
            throw new GradeUpdateException("Ошибка обновления: у студента " + name + " уже стоит оценка " + newGrade);
        }
        this.grade = newGrade;
        System.out.println("Оценка студента " + name + " успешно обновлена на " + newGrade);
    }

    public void promote() {
        System.out.println("Студент " + name + " успешно переведен на следующий курс!");
    }
}

