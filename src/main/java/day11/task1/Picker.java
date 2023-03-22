package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed = false;
    private int countPicker;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public int getCountPicker(){
        return countPicker;
    }

    public void setCountPicker (int countPicker){
        this.countPicker = countPicker;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
        countPicker++;
    }

    public String toString() {
        return "Зарплата доставщика: " + salary;
    }

    public void doWork() {
        salary += 80;
        warehouse.incrementCountPickedOrders();
    }

    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10_000 && !isPayed) {
            isPayed = true;
            salary += (70_000 / countPicker);
        } else if (isPayed) {
            System.out.println("Бонус уже был выплачен");
        } else if (warehouse.getCountPickedOrders() < 10_000) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
