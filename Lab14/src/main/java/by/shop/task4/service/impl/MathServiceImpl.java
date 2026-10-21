package by.shop.task4.service.impl;

import by.shop.task4.service.MathService;

import java.io.*;

public class MathServiceImpl implements MathService {

    @Override
    public int findMaxInBinaryFile(String filename, int count) throws IOException {
        int max = Integer.MIN_VALUE;
        System.out.print("Числа из файла: ");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            for (int i = 0; i < count; i++) {
                int value = dis.readInt();
                System.out.print(value + " ");
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println();
        return max;
    }

    @Override
    public void separateSigns(String srcFile, String posFile, String negFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(srcFile));
             PrintWriter writerPos = new PrintWriter(new FileWriter(posFile));
             PrintWriter writerNeg = new PrintWriter(new FileWriter(negFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line);
                if (value > 0) {
                    writerPos.println(value);
                } else if (value < 0) {
                    writerNeg.println(value);
                }
            }
        }
    }

    @Override
    public double calculateAveragePressure(String filename, int count) throws IOException {
        double sum = 0;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            for (int i = 0; i < count; i++) {
                sum += dis.readDouble();
            }
        }
        return sum / count;
    }

    @Override
    public int countEvenNumbersInTextFile(String filename) throws IOException {
        int evenCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line);
                if (value % 2 == 0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
}

