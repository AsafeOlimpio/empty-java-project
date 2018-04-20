package com.teaching.android;

import java.util.Arrays;

public class arrayPractice {
    int size = 3;
    private int[][] anArray2 = new int[size][size];
    private int[] anArray1 = {3,2,1,1,2,3,2,3,1};



    public arrayPractice() {
        this.anArray2 = anArray2;
        this.anArray1 = anArray1;

    }

    //Inicialize
    public void asignar(){
        this.anArray2 = anArray2;
        this.anArray1 = anArray1;
        int indice = 0;
        for (int i = 0; i < anArray2.length; i++){
            for (int j = 0; j < anArray2.length; j++){
                anArray2[i][j] = anArray1[indice++];
            }
        }
        System.out.println(anArray2);
        //
    }

    public void mostrar(){
        for (int i = 0; i < anArray2.length; i++) {
            for (int j = 0; j < anArray2.length; j++) {
                System.out.print(anArray2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void suma(){
    this.anArray2 = anArray2;
    this.anArray1 = anArray1;
    System.out.println(anArray2);

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getAnArray2() {
        return anArray2;
    }

    public void setAnArray2(int[][] anArray2) {
        this.anArray2 = anArray2;
    }

    public int[] getAnArray1() {
        return anArray1;
    }

    public void setAnArray1(int[] anArray1) {
        this.anArray1 = anArray1;
    }

    @Override
    public String toString() {
        return "arrayPractice{" +
                "size=" + size +
                ", anArray2=" + Arrays.toString(anArray2) +
                ", anArray1=" + Arrays.toString(anArray1) +
                '}';
    }

    public arrayPractice(int size) {
        this.size = size;
    }
}
