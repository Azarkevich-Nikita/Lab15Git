package by.shop.task4.service.impl;

import by.shop.task4.entity.City;
import by.shop.task4.service.FileService;

import java.io.*;
import java.util.Scanner;

public class FileServiceImpl implements FileService {

    @Override
    public void saveCityInfo(String filename, City city) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(city.toString());
        }
    }

    @Override
    public void printTextFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
        }
    }

    @Override
    public void writeIntegersFromConsole(String filename, int count) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + count + " целых чисел:");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < count; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                dos.writeInt(scanner.nextInt());
            }
        }
    }

    @Override
    public void writeDoublesFromConsole(String filename, int count) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + count + " вещественных значений давления (например, 745,2):");

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < count; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                dos.writeDouble(scanner.nextDouble());
            }
        }
    }

    @Override
    public void writeRandomNumbersText(String filename, int[] numbers) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int num : numbers) {
                writer.println(num);
            }
        }
    }
}

