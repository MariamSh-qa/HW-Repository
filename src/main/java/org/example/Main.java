package org.example;

public class Main {
    public static void main() {

        float productPrice = 137.50f; //Gel

        if (productPrice >= 100) {
            System.out.println("Final price:" + (productPrice - (productPrice * 10 / 100)) + "Gel"); }

            else
        {
            System.out.println("Final price: " + productPrice + "GEL");
        }


    }
}
