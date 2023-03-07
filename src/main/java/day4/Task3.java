package day4;

public class Task3 {
    public static void main(String[] args) {
        int m = 12; //Количество строк
        int n = 8; // Количество столбцов

        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[j].length; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }

        for (int i = 0; i < array.length; i++) {
            int sumLine = 0;
            for (int j = 0; j < array[j].length; j++) {
                sumLine += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("// сумма - " + sumLine);
        }

    }
}
