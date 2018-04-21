package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;

    public static void main(String[]args){
     Circulo C1 = new Circulo(5,2,3);
     System.out.println("El área del: " + C1 + " Es: " + C1.getArea());
     System.out.println("La Circumferencia del: " + C1 + " Es: " + C1.getCircumference());
    }

    //Constructor vacio
    public Circulo (){}

    //Constructor con parametros
    public Circulo (int radio, int x, int y){
        this.centro = new Punto(x,y);
        this.radio = radio;
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

    public double getCircumference(){
        double Cf = (Math.PI * 2) * radio;
        return Cf;
    }

    @Override
    public String toString() {
        return "Circulo de" +
                " " + centro +
                "y radio=" + radio;
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
