package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike newMotorbike = new Motorbike("Moto", "red", 154);

        System.out.println(newMotorbike.getModel());
        System.out.println(newMotorbike.getColor());
        System.out.println(newMotorbike.getYear());
    }
}

class Motorbike {
    String model;
    String color;
    int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

}
