package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("day16Task1.txt");
        printResult(file);
    }

    public static void printResult(File file){

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String [] array = line.split(" ");

            int sumDigits = 0;
            int countDigits = 0;

            for (String s: array) {
                sumDigits += Integer.parseInt(s);
                countDigits++;
            }

            double result = (double) sumDigits/countDigits;
            //double resultCut = (double) ((int) (result * 1000)) / 1000;
            System.out.print(result + "-->");
            System.out.printf(Locale.ENGLISH, "%.3f", result);

        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
    }
}

