package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            double dividend = console.nextDouble();
            double divisor = console.nextDouble();
            if (divisor==0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(dividend/divisor);
        }
    }
}
