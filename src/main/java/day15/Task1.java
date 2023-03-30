package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        File sorceFile = new File("src/main/resources/shoes.csv");
        File endFile = new File("src/main/resources/data.txt"); //создали ссылку на не существующий файл

        List<String> listOfStrings = new ArrayList<>();
        List<Shoes> shoesList = new ArrayList<>();

        try (FileReader fileReader = new FileReader(sorceFile)) {

            char ch;
            String s = "";
            int bugTrack = -1; //Счётчик столбцов

            while (fileReader.ready()) {
                ch = (char) fileReader.read();

                if (ch == ';') {
                    listOfStrings.add(s);
                    s = new String();
                    bugTrack++;
                } else if (ch == '\n') {
                    if (bugTrack > 1) {
                        throw new IllegalArgumentException(); //Ловим количество столбцов
                    }
                    listOfStrings.add(s);
                    s = new String();
                    bugTrack = -1;
                } else {
                    s += ch;
                }
            }

            if (listOfStrings.size() == 0) {
                throw new IllegalArgumentException(); //Ловим пустой файл если
            }

            for (int j = 0; j < listOfStrings.size(); j = j + 3) {
                shoesList.add(new Shoes(listOfStrings.get(j), Integer.parseInt(listOfStrings.get(j + 1)), Integer.parseInt(listOfStrings.get(j + 2))));
            }

            PrintWriter printWriter = new PrintWriter(endFile);

            for (Shoes sh : shoesList) {
                if (sh.getQuantity() == 0) {
                    printWriter.println(sh);
                }
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл отсутствует");
        } catch (IllegalArgumentException e) { // На случай пустого файла либо
            System.out.println("Неверное содержимое файла");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}



