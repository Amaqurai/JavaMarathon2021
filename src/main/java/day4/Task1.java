package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int arraySize = console.nextInt();
        int[] array = new int[arraySize];

        int countEight = 0;
        int countOne = 0;
        int countEven = 0;
        int countOdd = 0;
        int summ = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        // Вывод массива
        System.out.println("Введено число " + arraySize + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        //Вывод длины массива
        System.out.println("Длинна массива: " + array.length);

        for (int j : array) {

            if (j > 8) {countEight++;}

            if (j == 1) {countOne++;}

            if (j % 2 == 0 && j!=0) {countEven++;}

            if (j % 2 != 0) {countOdd++;}

            summ += j;
        }
        System.out.println("Количество чисел больше 8: " + countEight);
        System.out.println("Количество чисел равных 1: " + countOne);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}
