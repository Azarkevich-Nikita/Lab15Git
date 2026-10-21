package by.shop.task4.entity;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, int x, int y, double width, double height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Рисую прямоугольник " + width + "x" + height + " в координатах (" + getX() + "," + getY() + ")");
    }
}
