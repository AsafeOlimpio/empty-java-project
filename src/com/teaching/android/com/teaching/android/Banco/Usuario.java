package com.teaching.android.Banco;

public class Usuario {
    private String nombre;
    private int pin;
    private double saldo;
    //String;

    public Usuario(String nombre, int pin, double saldo){
        this.nombre = nombre;
        this.pin = pin;
        this.saldo = saldo;
    }

    public double consultarSaldo(){
        System.out.println(saldo);
        return saldo;
    }

    public void login(String nombre, int pin){

    }
}
