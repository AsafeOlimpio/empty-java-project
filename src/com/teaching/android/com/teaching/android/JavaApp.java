package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

import static com.teaching.android.GuessTheNumber.tryAgain;

public class JavaApp extends GuessTheNumber{

    public static void main(String[] args) {
    Punto p1 = new Punto(2,4);
    Punto p2 = new Punto(3,5);
    // 3 Maneras de calcular la distancia.
    //System.out.println(p1.distancia(3,5));//Ahora ya no podemos referenciar distancia pues lo hemos cambiado a privado
    //System.out.println("La distancia entre punto los puntos es: " + p2.distancia(2,4));
    System.out.println("La distancia entre los puntos es: " + p2.distancia(p1));
    System.out.println(p1);
    }
}