package com.teaching.android;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Punto {
    private int x;
    private int y;

    // Methods

    public int distancia (int xl, int yl){
       // variables x
       int x1 = 0;
       int x2 = 0;
       int restax = x1 - x2;
       //variables y
        int y1 = 0;
        int y2 = 0;
        int restay = y1 - y2;
       //Formula
       xl = restax;
       yl = restay;


    }

    //Constructors
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){

    }

    //Getters & Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
