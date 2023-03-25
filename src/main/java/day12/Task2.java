package day12;

import java.util.ArrayList;

import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        addFromAndTo(0,30,list);
        addFromAndTo(300,350,list);
        System.out.println(list);
    }

    public static void addFromAndTo (int a, int b, List <Integer> array){
        for (int i = a; i <= b; i += 2) {
            array.add(i);
        }
    }

}
