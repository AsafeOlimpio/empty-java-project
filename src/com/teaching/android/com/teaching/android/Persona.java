package com.teaching.android;

public class Persona {
    private String nombre;
    private float dinero;

    public Persona(String nombre, float dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
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

    public void pagar(Persona p, float cantidad) {
        dinero = dinero + cantidad;
        p.dinero = p.dinero - cantidad;

    }

}
