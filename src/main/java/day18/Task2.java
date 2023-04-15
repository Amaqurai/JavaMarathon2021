package day18;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(count7(717_771_237));
    }

    public static int count7(int digit) {
        if (digit == 0) {
            return 0;
        }
        int count = 0;
        if ((double)digit%10 == 7) {
            count++;
        }

        return count + count7(digit / 10);
    }
}
