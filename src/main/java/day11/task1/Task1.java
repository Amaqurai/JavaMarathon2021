package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        Worker worker1 = new Courier(warehouse);
        Worker worker2 = new Picker(warehouse);

        businessProcess(worker1);
        businessProcess(worker2);

        System.out.println(warehouse.toString());

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());

    }

    public static void businessProcess (Worker worker){
        for (int i = 0; i < 10_000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
