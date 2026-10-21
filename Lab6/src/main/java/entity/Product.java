package entity;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.name = "None";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name){
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(){
        this.quantity = quantity;
    }

    public double totalCost(){
        return price * quantity;
    }
}
