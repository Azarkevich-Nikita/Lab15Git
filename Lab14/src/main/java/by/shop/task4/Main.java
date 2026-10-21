package by.shop.task4;

import by.shop.task4.entity.City;
import by.shop.task4.service.FileService;
import by.shop.task4.service.MathService;
import by.shop.task4.service.impl.FileServiceImpl;
import by.shop.task4.service.impl.MathServiceImpl;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Main {
    static void main() {
        FileService fileService = new FileServiceImpl();
        MathService mathService = new MathServiceImpl();

        try {
            System.out.println("\nЗадания 1");
            String cityFile = "city_info.txt";
            City minsk = new City("Минск", "Беларусь", 1067, 2.0);
            fileService.saveCityInfo(cityFile, minsk);

            File fObj = new File(cityFile);
            System.out.println("Метаданные файла:");
            System.out.println("  Имя: " + fObj.getName());
            System.out.println("  Размер: " + fObj.length() + " байт");
            System.out.println("Содержимое файла:");
            fileService.printTextFile(cityFile);

            System.out.println("\nЗадания 2");
            String integersFile = "f.txt";
            fileService.writeIntegersFromConsole(integersFile, 10);
            int maxVal = mathService.findMaxInBinaryFile(integersFile, 10);
            System.out.println("Максимальное число в файле: " + maxVal);

            System.out.println("\nЗадания 3");
            String randsFile = "f_rand.txt";
            Random random = new Random();
            int[] mockRands = new int[15];
            for (int i = 0; i < 15; i++) {
                mockRands[i] = random.nextInt(200) - 100;
            }
            fileService.writeRandomNumbersText(randsFile, mockRands);
            mathService.separateSigns(randsFile, "g.txt", "h.txt");
            System.out.println("Файлы g.txt и h.txt успешно созданы через потоки.");

            System.out.println("\nВыполнение задания 4");
            String pressureFile = "pressure.txt";
            fileService.writeDoublesFromConsole(pressureFile, 15);
            double avgPressure = mathService.calculateAveragePressure(pressureFile, 15);
            System.out.printf("Среднее атмосферное давление: %.2f мм рт. ст.\n", avgPressure);

            System.out.println("\nВыполнение задания 5");
            String evenCheckFile = "f_even.txt";
            int[] numbersForTask5 = {12, 5, 8, 14, 3, 21, 44, 7, 10, 13};
            fileService.writeRandomNumbersText(evenCheckFile, numbersForTask5);
            int evenCount = mathService.countEvenNumbersInTextFile(evenCheckFile);
            System.out.println("Количество чётных значений в файле: " + evenCount);

        } catch (IOException e) {
            System.err.println("Критическая ошибка работы с потоками: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
