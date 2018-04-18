package com.teaching.android;

public class Persona {
    private String Persona;
    private float Dinero;

    public String getPersona() {
        return Persona;
    }

    public void setPersona(String persona) {
        Persona = persona;
    }

    public float getDinero() {
        return Dinero;
    }

    public void setDinero(float dinero) {
        Dinero = dinero;
    }

    Persona Paco = new Persona();
    Persona Pepe = new Persona();
}
