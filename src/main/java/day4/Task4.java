package day4;

public class Task4 {
    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10_000);
        }

        int sumFirst; //Оператор временного хранения суммы
        int sumLast = Integer.MIN_VALUE; //Оператор длительного хранения максимальной суммы
        int[] arrayLast = new int[3]; //Массив для длительного хранения индексов

        for (int i = 0; i < array.length - 2; i++) {
            sumFirst = 0;
            int[] arrayBuff = new int[3]; //Массив временного хранения индексов
            for (int j = i, k = 0; j < i + 3; j++, k++) { //
                sumFirst += array[j];
                arrayBuff[k] = j;
            }
            if (sumFirst > sumLast) { //Длительное хранение максимальной суммы и массива индексов
                sumLast = sumFirst;
                arrayLast = arrayBuff;
            }
        }
        System.out.println(sumLast);
        System.out.println(arrayLast[0]);
    }
}
