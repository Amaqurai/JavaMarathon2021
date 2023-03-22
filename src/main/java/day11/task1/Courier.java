package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed = false;
    private int countCourier;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public int getCountCourier(){
        return countCourier;
    }

    public void setCountCourier (int countCourier){
        this.countCourier = countCourier;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        countCourier++;
    }

    public String toString() {
        return "Зарплата курьера: " + salary;
    }

    public void doWork() {
        salary += 100;
        warehouse.incrementCountDeliveredOrders();
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10_000 && !isPayed) {
            isPayed = true;
            salary += (50_000 / countCourier);
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountDeliveredOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
