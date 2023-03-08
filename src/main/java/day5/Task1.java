package day5;

public class Task1 {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.setModel("Renault");
        newCar.setColor("Red");
        newCar.setYear(2020);

        System.out.println(newCar.getModel());
        System.out.println(newCar.getColor());
        System.out.println(newCar.getYear());
    }

    public static class Car {
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
    }
}
