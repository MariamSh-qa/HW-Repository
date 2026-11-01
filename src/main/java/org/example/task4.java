package org.example;


public class task4 {
     public static void main(String[] args) {

        String Status ="NEW";

        switch (Status) {
            case "NEW":
                System.out.println("Order Received");
                break;

            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;

            case "SHIPPED":
                System.out.println("Order is on the way");
                break;

            case "DELIVERED":
                System.out.println("Order Delivered");
                break;

            default:
                System.out.println("Unknown Status");
        }
    }
}
