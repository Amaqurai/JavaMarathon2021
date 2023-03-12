package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, " +
                        "год выпуска: %d, " +
                        "длина: %d, вес: %d, " +
                        "количество топлива в баке: %d\n",
                manufacturer, year, length, weight, getFuel());
    }

    public void fillUp(int n) {
        setFuel(getFuel() + n);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length < airplane2.length) {
            System.out.print("Второй самолет длиннее. ");
        } else if (airplane1.length > airplane2.length) {
            System.out.printf("Первый самолет длиннее. ");
        } else {
            System.out.printf("Длины самолетов равны. ");
        }
        System.out.printf("Самолет 1 длина %d, самолёт 2 длина %d", airplane1.length, airplane2.length);
    }
}
