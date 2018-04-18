package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        do {
            JavaApp.guessTheNumber();
            JavaApp.tryAgain();
        }while (tryAgain());

    }


    public static void guessTheNumber() {

        int a = 3;
        Random generator = new Random();
        final int random = generator.nextInt(10) + 1;
        System.out.println("I'm thinking on a number. Can you guess it? Introduce a Number");

        do {

            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();

            if (value == random) {
                System.out.println("Correct");
                break;
            } else if (value > random) {
                System.out.println("The Number is Smaller");
                a = --a;
            } else {
                System.out.println("The Number is Greater");
                a = --a;
            }
            System.out.println("You have " + a + " tries");
        } while (a > 0);

        System.out.println("The number is " + random);
    }

    public static boolean tryAgain() {
        Scanner keyboard = new Scanner(System.in);
        String text;
        System.out.println("Want to play again? If Yes type: (y) If not type: (n)");
        text = keyboard.nextLine();
        if (text.equals("y")) {
            return true;
        } else {
            System.out.println("Adiós");
            return false;
        }
    }
}