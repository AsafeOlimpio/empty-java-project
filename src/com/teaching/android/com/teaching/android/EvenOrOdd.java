package com.teaching.android;

import java.util.Scanner;

public class EvenOrOdd {

    private int x;

    public static void main(String[]args){
        EvenOrOdd number = new EvenOrOdd();
        number.is();
        //System.out.println(-50 % 2);
    }

    public int is(){
        System.out.println("Welcome to Even or Od Calculator. Please introduce a number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 2 == 0){System.out.println(x + ":" + " Is Even");}
        else {System.out.println(x + ":" + " Is Odd");}
        return x;
    }
}
