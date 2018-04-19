package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;

    public static void main(String[]args){
     Circulo C1 = new Circulo(10,2,3);
     System.out.println(C1);
    }

    //Constructor vacio
    public Circulo (){}

    //Constructor con parametros
    public Circulo (int radio, int x, int y){
        this.centro = new Punto(x,y);
    }

    //Constructor Con 2 parametros
    public Circulo(Punto centro, int radio) {
        this.centro = centro;
        this.radio = radio;
    }

    //Metodos
    public double getArea(){

       double Area = Math.PI * Math.pow(radio,2);
       return Area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }

//Getters & Setters

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
