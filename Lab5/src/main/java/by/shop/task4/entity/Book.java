package by.shop.task4.entity;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String name, String author, int year){
        this.title = name;
        this.author = author;
        this.year = year;
    }

    public boolean isOld(){
        return year > LocalDateTime.now().getYear() -  50;
    }
}
