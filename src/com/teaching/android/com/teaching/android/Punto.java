package com.teaching.android;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Punto {
    private int x;
    private int y;

    //Constructors
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {

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

    // Methods

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distancia(double px, double py) {
       /* // variables x
        double difx = px - x;
        //variables y
        double dify = py - y;
        //Elevación
        double elevationx = Math.pow(difx, 2);
        double elevationy = Math.pow(dify, 2);
        double sumxy = elevationx + elevationy;
        double d = Math.sqrt(sumxy);
        return d;*/

        double resultado = Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2));
        return resultado;
    }

    //Al crear este método puedo dejar el metodo distancia como privado
    /*public double distancia(Punto p) {
        double resultado = distancia(p.x,p.y);
        return resultado;
    }*/

}
