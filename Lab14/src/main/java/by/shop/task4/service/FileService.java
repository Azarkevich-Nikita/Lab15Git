package by.shop.task4.service;

import by.shop.task4.entity.City;

import java.io.IOException;

public interface FileService {
    void saveCityInfo(String filename, City city) throws IOException;
    void printTextFile(String filename) throws IOException;
    void writeIntegersFromConsole(String filename, int count) throws IOException;
    void writeDoublesFromConsole(String filename, int count) throws IOException;
    void writeRandomNumbersText(String filename, int[] numbers) throws IOException;
}

