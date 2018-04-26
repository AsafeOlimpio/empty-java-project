package Consesionario;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;

public class Consesionario {
    //Attributes
    private String nombre;
    private String direccion;
    private int telefono;
    //Creamos una constante para el numero de vehiculos que nuestro concesionário tendrá
    private static final int size = 5;
    //Podemos pasar clases como atributos
    private SortedSet<Vehiculo> vehiculo = new TreeSet<>((v1,v2) -> v1.compareTo(v2) );

    //Constructor


    public Consesionario(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculo = vehiculo;
    }

    //Metodo Introducir Vehiculo

    public void addVehiculo(Vehiculo vehiculos){
        vehiculo.add(vehiculos);
    }


    /*public void addVehiculo(Vehiculo vehiculos) throws Exception {
        int i = 0;
        for (; i < vehiculo.length; i++){
            //Hay que definir la posición del array
            if(vehiculo[i]==null){
                //El vector usa el indice para recorrer la matriz
                this.vehiculo[i] = vehiculos;
                //Debemos decir al metodo que una vez lea el bucle y asigne la clase a la posición pare, con un break;
                break;
            }
        }
        if (i >= size){throw new Exception();}
    }*/

    //Metodo buscar vehículo

    /*public void buscar(String matricula) throws Exception{
        Vehiculo vehicle = null;
        int i =0;
            for (;i<size; i++) {
                if (vehiculo[i] != null && vehiculo[i].getMatricula().equals(matricula)) {
                    vehicle = vehiculo[i];
                    System.out.println(vehicle);
                    break;
                }
            }
        if (i >= size){throw new Exception();
        }
    }*/

    //To String
    @Override
    public String toString() {
        return "Consesionario{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", vehiculo=" + vehiculo +
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
