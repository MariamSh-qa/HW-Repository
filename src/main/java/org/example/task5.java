package org.example;


public class task5 {
    public static void main(String[] args) {

        String text ="Earth";
        int count = 0;


        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'i' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'u') {

                count++;
            }
        }

        System.out.println("Number of vowels: " + count);

        System.out.println("String length: " + text.length());

        if (text.length() % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }



    }
}