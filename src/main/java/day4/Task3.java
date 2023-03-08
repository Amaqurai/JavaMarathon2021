package day4;

public class Task3 {
    public static void main(String[] args) {

        int m = 12; //Количество строк
        int n = 8; // Количество столбцов

        int[][] array = new int[m][n];
        int[] sumMemory = new int[m]; //Вспомогательная матрица хранения сумм строк

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < array[j].length; j++) {
                sumLine += array[i][j];
            }
            sumMemory[i] = sumLine;
        }

        int maxValueIndex = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < sumMemory.length; i++) {
            if (sumMemory[i] >= maxValue) {
                maxValue = sumMemory[i];
                maxValueIndex = i;
            }
        }
        System.out.println("Index line with maximum sum: " + maxValueIndex);
    }
}
