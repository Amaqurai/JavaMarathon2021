package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int countZero = 0;
        int summZero = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10_000);
        }

        System.out.println("Наш массив:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + maxValue);

        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("Наименьший элемент массива: " + minValue);

        for (int i = 0; i < array.length; i++) {
            if (array[i]%10==0){
                countZero++;
                summZero+=array[i];
            }
        }
        System.out.println("Количество чисел оканчивающихся на 0: " + countZero);
        System.out.println("Сумма чисел оканчивающихся на 0: " + summZero);
    }
}
