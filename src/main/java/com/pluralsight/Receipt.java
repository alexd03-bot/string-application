package com.pluralsight;

public class Receipt {

    public static void main(String[] args) {

        //1. Variables for item and price
        String item = "bookcase";
        double itemPrice = 42.99;

        //2. Quantity variable
        int quantity = 2;

        //Build and print
        System.out.println("You bought " + quantity + " " + item + "(s) for $" + itemPrice + ".");




    }
}
