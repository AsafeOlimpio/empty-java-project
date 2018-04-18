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

        do {
            System.out.println("Introduce a Number");
            Scanner sc =new Scanner(System.in);
            int value = sc.nextInt();

            if (value == random) {
                System.out.println("Correct");
                break;
            } else if (value > random) {
                System.out.println("Smaller");
                a = --a;
            } else {
                System.out.println("Greater");
                a = --a;
            }
        } while (a > 0);

        System.out.println(random);
    }
}