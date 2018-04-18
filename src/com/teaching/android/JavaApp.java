package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args)
    {

        int a = 3;
        Random generator = new Random();
        final int random = generator.nextInt(10) + 1;
        System.out.println("I'm thinking on a number. Can you guess it? Introduce a Number");

        do {

            Scanner sc =new Scanner(System.in);
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
            System.out.println("Try Again");
        } while (a > 0);

        System.out.println("The number is " + random);
    }
}