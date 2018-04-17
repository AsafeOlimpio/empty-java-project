package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args)
    {
        System.out.println("Introduce tu número");
        Scanner sc =new Scanner(System.in);
        int value = sc.nextInt();
        //do {

            System.out.println(value);
            sc.close();
            if (value % 2 == 0)
            {

                System.out.println("Tu número es par");
                sc.close();

            }
            else if (value % 2 != 0)
            {
                
                System.out.println("Tu número es impar");
                sc.close();
            }
        //} while (value != -1);


        }
    }