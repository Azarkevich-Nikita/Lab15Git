package by.shop.task4.entity;

public class Shape {
    private String color;
    private int x;
    private int y;

    public Shape(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() { return color; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void draw() {
        System.out.println("Рисую фигуру");
    }

    public void draw(String color) {
        System.out.println("Рисую фигуру цветом " + color);
    }

    public void draw(int size) {
        System.out.println("Рисую фигуру размером " + size);
    }

    public double calculateArea() {
        return 0;
    }
}