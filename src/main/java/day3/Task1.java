package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String country = "";

        while (!country.equals("Stop")){
            country = console.nextLine();
            switch (country) {
                case "Москва":
                case "Ростов":
                case "Владивосток":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Турин":
                case "Милан":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}