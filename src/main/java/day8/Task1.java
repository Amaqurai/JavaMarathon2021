package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var str = "";
        for (int i = 0; i <= 20_000; i++) {
            String str2 = Integer.toString(i);
            str = str.concat(str2).concat(" ");
        }
        System.out.println(str);
        long stopTime = System.currentTimeMillis();


        long startTime1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20_000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long stopTime1 = System.currentTimeMillis();

        System.out.println("Длительность работы конкатенации в мс: " + (stopTime - startTime));
        System.out.println("Длительность работы стринг билдера в мс: " + (stopTime1 - startTime1));
    }
}
