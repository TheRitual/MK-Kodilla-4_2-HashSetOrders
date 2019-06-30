package com.kodilla;

public class Order {
    private final String productName;
    private final int productId;
    private final int copyNumber;

    Order(String productName, int productId, int copyNumber){
        this.productName = productName;
        this.productId = productId * 10000;
        this.copyNumber = copyNumber;
    }

    @Override
    public boolean equals(Object o) {
        Order r = (Order) o;
        return this.productName.equals(r.productName)
                && this.copyNumber == r.copyNumber
                && this.productId == r.productId;
    }

    @Override
    public int hashCode() {
        return this.productId + this.copyNumber;
    }

    public String toString() {
        return "{" + this.productName + "} " + productId + "\\" + copyNumber;
    }

    public static Order generator(int copyNumber) {
        return new Order(GiveMe.randomJoinedAnimalName() + GiveMe.randomJoinedAnimalName(), GiveMe.randomInt(5), copyNumber);
    }
}
