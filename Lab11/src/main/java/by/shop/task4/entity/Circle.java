package by.shop.task4.entity;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, int x, int y, double radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public double getRadius() { return radius; }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг радиусом " + radius + " в координатах (" + getX() + "," + getY() + ")");
    }

    public void draw(boolean fill) {
        System.out.println("Рисую круг. Заливка: " + (fill ? "Да" : "Нет"));
    }
}