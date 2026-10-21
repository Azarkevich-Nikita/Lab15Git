package by.shop.task4.entity;

import java.util.List;

public class Employee {
    private String id;
    private String name;
    private String department;
    private int level;
    private List<Integer> performanceReviews;

    public Employee(String id, String name, String department, int level, List<Integer> performanceReviews) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.level = level;
        this.performanceReviews = performanceReviews;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public double getAveragePerformance() {
        if (performanceReviews == null || performanceReviews.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int score : performanceReviews) {
            sum += score;
        }
        return sum / performanceReviews.size();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Отдел: " + department +
                ", Уровень: " + level + ", Эффективность: " + String.format("%.2f", getAveragePerformance());
    }
}