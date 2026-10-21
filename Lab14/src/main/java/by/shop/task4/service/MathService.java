package by.shop.task4.service;

import java.io.IOException;

public interface MathService {
    int findMaxInBinaryFile(String filename, int count) throws IOException;
    void separateSigns(String srcFile, String posFile, String negFile) throws IOException;
    double calculateAveragePressure(String filename, int count) throws IOException;
    int countEvenNumbersInTextFile(String filename) throws IOException;
}
