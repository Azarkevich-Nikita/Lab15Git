package by.shop.task4;

import by.shop.task4.entity.Circle;
import by.shop.task4.entity.Rectangle;
import by.shop.task4.entity.Shape;

public class Main {
    static void main() {

        System.out.println("Перегрузка методов");
        Shape genericShape = new Shape("Красный", 0, 0);
        genericShape.draw();
        genericShape.draw("Синий");
        genericShape.draw(15);
        System.out.println();

        System.out.println("Переопределение");
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Зеленый", 10, 10, 5.0);
        shapes[1] = new Rectangle("Желтый", 20, 5, 4.0, 6.0);
        shapes[2] = new Circle("Белый", -5, 0, 2.5);
        shapes[3] = new Rectangle("Черный", 0, 12, 3.0, 3.0);

        for (Shape currentShape : shapes) {
            currentShape.draw();
            currentShape.draw(currentShape.getColor());
            currentShape.draw(42);
            System.out.printf("Площадь фигуры: %.2f%n", currentShape.calculateArea());

            if (currentShape instanceof Circle) {
                Circle circle = (Circle) currentShape;
                circle.draw(true);
            }
            System.out.println("-------------------------------------------------");
        }
    }
}
