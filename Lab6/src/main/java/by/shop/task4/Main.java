package by.shop.task4;

import entity.Product;

public class Main {
    static void main() {
        Product product1 = new Product();
        Product product2 = new Product("Ноутбук");
        Product product3 = new Product("Смартфон", 799.99);
        Product product4 = new Product("Наушники", 49.99, 3);

        product1.setName("Клавиатура");

        System.out.println("Товар 1: " + product1.getName() + ", Цена: " + product1.getPrice() + ", Количество: " + product1.getQuantity());
        System.out.println("Товар 2: " + product2.getName() + ", Стоимость: " + product2.totalCost());
        System.out.println("Товар 3: " + product3.getName() + ", Стоимость: " + product3.totalCost());
        System.out.println("Товар 4: " + product4.getName() + ", Общая стоимость: " + product4.totalCost());
    }
}
