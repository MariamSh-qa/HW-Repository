package org.example;

public class task2 {
     public static void main(String[] args) {

        String userName = "Mariami";
        String password = "Sharikadze";

        if (userName.equals("Mariami") && password.equals("Sharikadze")) {
            System.out.println("Login successful");
        }

        /*else {
                 System.out.println("Invalid username or password");
              } */

        else if (!userName.equals("Mariami") || !password.equals("Sharikadze")) {
            System.out.println("Invalid username or password");
        }


    }
}
