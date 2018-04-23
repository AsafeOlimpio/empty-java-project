package com.teaching.android;

public class mainMatriz {
    public static void main(String[]args){
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        int [] v1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int [] v2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        m1.asignarDatos(v1);
        m2.asignarDatos(v2);
        //m2.suma();
        m1.mostrar();
        m2.mostrar();
    }

}
