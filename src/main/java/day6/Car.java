package day6;

public class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String modelName) {
        model = modelName;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String colorName) {
        color = colorName;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int yearIssue) {
        year = yearIssue;
    }

    public int getYear() {
        return year;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear-getYear());
    }
}