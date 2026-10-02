package com.example.demo;

public class main {

    public static void main(String[] args) {

        int quantity = 3;
        double unitPrice = 24.99;
        String name = "Wireless Mouse";
        boolean inStock = true;

        double total = calculateTotal(quantity, unitPrice);

        System.out.println(name + " x " + quantity + " = " + total);
    }

    public static double calculateTotal(int quantity, double unitPrice) {
        return quantity * unitPrice;
    }
}