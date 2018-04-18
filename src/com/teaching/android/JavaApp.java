package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args)
    {

        int a = 0;

        do {

            System.out.println("Introduce tu número");
            Scanner sc =new Scanner(System.in);
            int value = sc.nextInt();

            Random generator = new Random();
            int random = generator.nextInt(10) + 1;


            if (value == random) {
                System.out.println("Correct" + ++a);
            } else if (value > random) {
                System.out.println("Greater" + ++a);
            } else if (value < random) {
                System.out.println("Smaller" + ++a);
            }
        } while (a == 3);
    }
}