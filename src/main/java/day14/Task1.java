package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            int sum = 0;
            int countNumbers = 0;
            final int MIN_MAX_COUNT = 10;

            for (String s : numbersString) {
                sum += Integer.parseInt(s);
                countNumbers++;
            }

            if (countNumbers > MIN_MAX_COUNT || countNumbers < MIN_MAX_COUNT) {
                throw new IllegalArgumentException();
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input file");
        }
    }
}
