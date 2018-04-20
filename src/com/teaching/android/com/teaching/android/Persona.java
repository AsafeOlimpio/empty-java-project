package com.teaching.android;

public class Persona {

    public static void main(String[]args){
        Persona p1 = new Persona("Paco",700f);
        Persona p2 = new Persona("Pepe",500f);
        p2.pagar(p1,200f);
        System.out.println(p1);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dinero=" + dinero +
                '}';
    }

    private String nombre;
    private float dinero;

    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public void pagar(Persona quien, float cantidad){
        dinero = dinero + cantidad;
        quien.dinero = dinero - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }




/*private String nombre;
    private float dinero;

    public static void main(String[] args) {

        Persona p1 = new Persona("Pepe", 100);
        Persona p2 = new Persona("Paco", 500);
        p1.pagar(p2,200F);
        System.out.println("Pepe Tiene: " + p1.getDinero() + " Paco Tiene: " + p2.getDinero());
    }

    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    public void pagar(Persona p, float cantidad) {
        dinero = dinero + cantidad;
        p.dinero = p.dinero - cantidad;

    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }*/

}
