package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final int MAX_VALUE = 1000;
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        try {
            PrintWriter printWriter = new PrintWriter(file1);
            int randomDigit;
            for (int i = 0; i < MAX_VALUE; i++) {
                randomDigit = (int) (Math.random() * MAX_VALUE);
                printWriter.print(randomDigit + " ");
            }
            printWriter.close();

            printWriter = new PrintWriter(file2);
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] array = line.split(" ");

            int sumDigits = 0;
            double average;
            final int LOT_OF_NUMBERS = 20;
            for (int i = 0; i < MAX_VALUE; i++) {
                if (i % LOT_OF_NUMBERS == 0 && i != 0) {
                    average = (double) sumDigits / LOT_OF_NUMBERS;
                    printWriter.print(average + " ");
                    sumDigits = 0;
                }
                sumDigits += Integer.parseInt(array[i]);
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        printResult(file1);

    }

    public static void printResult(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            double dubSumDigits = 0;
            for (int i = 0; i < array.length; i++) {
                dubSumDigits = Double.parseDouble(array[i]);
            }
            int intSumDigits = (int) dubSumDigits;
            System.out.println(intSumDigits);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
