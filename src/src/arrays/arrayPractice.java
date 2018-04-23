package arrays;

import java.util.Arrays;

public class arrayPractice {
    //Creaamos las variables
    int size = 3;
    private int[][] matriz = new int[size][size];
    private int[] vector = {};


    //Creamos los constructores
    public arrayPractice() {
        this.matriz = matriz;
        this.vector = vector;

    }

    //Metodo que asignará los datos del vector en la matriz
    public void asignarDatos(){
        this.matriz = matriz;
        this.vector = vector;
        int indice = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = vector[indice++];
            }
        }
        System.out.println(matriz);
        //
    }
    //Método que muestra el contenido de la matriz
    public void mostrar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void suma(int [][] matriz2){
        this.matriz = matriz;
        this.vector = vector;
        //suma() = matriz + matriz2;

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getmatriz() {
        return matriz;
    }

    public void setmatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[] getvector() {
        return vector;
    }

    public void setvector(int[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return "arrayPractice{" +
                "size=" + size +
                ", matriz=" + Arrays.toString(matriz) +
                ", vector=" + Arrays.toString(vector) +
                '}';
    }

    public arrayPractice(int size) {
        this.size = size;
    }
}
