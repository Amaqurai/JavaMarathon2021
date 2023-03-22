package day11.task1;

public class Warehouse {
    private int countPickedOrders; //Количество собранных заказов
    private int countDeliveredOrders;//Количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void incrementCountPickedOrders() {
        countPickedOrders++;
    }

    public void incrementCountDeliveredOrders() {
        countDeliveredOrders++;
    }

    public String toString() {
        return "Количество собранных заказов: " + countPickedOrders +
                ", \nКоличество доставленных заказов: " + countDeliveredOrders + "\n";
    }
}
