package org.example;

public class Main {
    public static void main() {

        double productPrice = 132; //Gel

        if (productPrice >= 100) {
            System.out.println("Final price:" + (productPrice - (productPrice * 10 / 100)) + "Gel"); }

            else
        {
            System.out.println("Final price: " + productPrice + "GEL");
        }


    }
}
