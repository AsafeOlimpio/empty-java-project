package Consesionario;

import java.util.Arrays;

public class Consesionario {
    //Attributes
    private String nombre;
    private String direccion;
    private int telefono;
    //Creamos una constante para el numero de vehiculos que nuestro concesionário tendrá
    private static final int size = 5;
    //Podemos pasar clases como atributos
    private Vehiculo[] vehiculo;

    //Constructor


    public Consesionario(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = new Vehiculo[size];
    }

    //Metodo Introducir Vehiculo
    public void addVehiculo(Vehiculo vehiculos){
        for (int i = 0; i < vehiculo.length; i++){
            //HAy que decir la posición del array
            if(vehiculo[i]==null){
                //El vector usa el indice para recorrer la matriz
                this.vehiculo[i] = vehiculos;
                //Debemos decir al metodo que una vez lea el bucle y asigne la clase a la posición pare, con un break;
                break;
            }
        }

    /*for(int i = 0; i < vehiculos.length; i++){
        if (vehiculo == null){
           this.vehiculo[size] = vehiculo;
        }
    }*/
    }

    //To String
    @Override
    public String toString() {
        return "Consesionario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", vehiculo=" + Arrays.toString(vehiculo) +
                '}';
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
