package com.equlaWorking;

public class Laptop {

    private String ModalName;
    private double ModalPrice;

    public Laptop(String modalName, double modalPrice) {
        super();
        ModalName = modalName;
        ModalPrice = modalPrice;
    }

    public Laptop() {
        super();
    }

    @Override
    public String toString() {
        return "Laptop [ModalName=" + ModalName + ", ModalPrice=" + ModalPrice + "]";
    }

    public String getModalName() {
        return ModalName;
    }

    public void setModalName(String modalName) {
        ModalName = modalName;
    }

    public double getModalPrice() {
        return ModalPrice;
    }

    public void setModalPrice(double modalPrice) {
        ModalPrice = modalPrice;
    }

    public boolean equals(Laptop p3) {
        return this.ModalName.equals(p3.ModalName) && this.ModalPrice == p3.ModalPrice;
    }

    public static void main(String[] args) {

        Laptop p1 = new Laptop("Dell", 60000);
        Laptop p2 = new Laptop("HP", 700000);
        Laptop p3 = new Laptop("HP", 700000);

        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));

        System.out.println(p2.ModalName.equals(p3.ModalName));
        System.out.println(p2.ModalPrice == (p3.ModalPrice));
    }
}
