package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            double dividend = console.nextDouble();
            double divisor = console.nextDouble();
            if (divisor != 0) {
                System.out.println(dividend / divisor);
            } else {
                break;
            }
        }
    }
}
