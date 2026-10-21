package by.shop.task4.entity;

public class Student {
    private String name;
    private double grade;
    private String group;

    public Student(String name, double grade, String group){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public static double averageGrade(Student[] students){
        double sumGrade = 0.0;
        for(Student student : students){
            sumGrade += student.grade;
        }
        return sumGrade / students.length;
    }

    public static double maxGrade(Student[] students){
        double maxGrade = students[0].grade;
        for(int i = 1; i < students.length; ++i){
            maxGrade = students[i].grade > maxGrade ? students[0].grade : maxGrade;
        }
        return maxGrade;
    }
}
