package day15;

public class Shoes {
    private String shoesName;
    private int shoesSize;
    private int quantity;

    public Shoes(String shoesName, int shoesSize, int quantity) {
        this.shoesName = shoesName;
        this.shoesSize = shoesSize;
        this.quantity = quantity;
    }

    public String getShoesName() {
        return shoesName;
    }

    public int getShoesSize() {
        return shoesSize;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return   shoesName +
                ", " + shoesSize +
                ", " + quantity;
    }
}
