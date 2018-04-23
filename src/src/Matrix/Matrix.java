package Matrix;

import java.util.Arrays;

public class Matrix {
    //Creaamos las variables
    private int size = 3;
    private int[][] matriz = new int[size][size];
    private int[] vector = {};
    private int[][] result;


    //Creamos los constructores
    public Matrix() {
        this.matriz = matriz;
        this.vector = vector;

    }

    //Metodo que asignará los datos del vector en la matriz y debe pedir un int[] para que introduzcamos el valor del vector
    public void asignarDatos(int[] vector){
        int indice = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                //El vector usa ek indice para recorrer la matriz
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
    //Metodo que suma 2 matrices
    //Pedimos un valor, una matriz exactamente "m1 o m2 creadas en el metodo main"
    public void suma(Matrix m){
        //Bucles for para recorrer la matriz bidimensional representados por "i" y "j" filas y columnas
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
               matriz[i][j] = matriz[i][j] + m.matriz[i][j];
               //System.out.println("La suma es igual a: " + matriz[i][j] + " ");
            }
        }
        //System.out.println(matriz);
    }
    //Metodo que multiplica las posiciones de una matriz por la otra
    public void producto(Matrix m){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = matriz[i][j] * m.matriz[i][j];
                //System.out.println("La suma es igual a:  * matriz[i][j] + " ");
            }
        }
        //System.out.println(matriz);
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

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "size=" + size +
                ", matriz=" + Arrays.toString(matriz) +
                ", vector=" + Arrays.toString(vector) +
                '}';
    }

    public Matrix(int size) {
        this.size = size;
    }
}
