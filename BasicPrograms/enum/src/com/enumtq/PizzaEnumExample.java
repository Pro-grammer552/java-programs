package com.enumtq;

public class PizzaEnumExample {

    enum PizzaSize {
        SMALL(10), MEDIUM(20), LARGE(30);

        private int price;

        PizzaSize(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        PizzaSize[] sizes = PizzaSize.values();

        System.out.println("Available Pizza Sizes:");
        for (PizzaSize size : sizes) {
            System.out.println(size + " - Price: $" + size.getPrice());
        }
    }
}
