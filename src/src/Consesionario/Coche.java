package Consesionario;

import java.util.Arrays;

public class Coche extends Vehiculo {
    //Attributes
    private String nombre;
    private int nplazas;
    private String extras;

    //Extended & Class Constructors

    public Coche(String matricula, String color, boolean isreserved, double precio, String nombre, int nplazas, String extras) {
        super(matricula, color, isreserved, precio);
        this.nombre = nombre;
        this.nplazas = nplazas;
        this.extras = extras;
    }
                                                        /*Métodos*/

    //Método para saber si el coche está reservado o no
    //Cuando se trata de un booleano un if else será lo más adecuado
    //Usar "Return" en vez de "System.out.println("Tardé un rato en descobrir que se podia usar return")"
    public String isReserved(){

        if (isIsreserved() == true){
            return "Reservado";
        }
        else {return "Disponible";}
    }

    //Método Mostrar Segun Matrícula
    public void csM(String matricula){
    //System.out.println(getMatricula(),getNombre(),getNplazas(),getExtras());
        System.out.println("El coche de matricula: " + getMatricula() + " Es: " + getNombre() + " Con: " + getNplazas() + " Plazas "  + " Con: " + getExtras());
    }

    //To String
    @Override
    public String toString() {
        return "Coche{ " +
                "nombre = ' " + nombre + '\'' + " Estado: " + isReserved() +
                ", nplazas = " + nplazas +
                ", Extras = '" + extras + '\'' +
                '}';
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNplazas() {
        return nplazas;
    }

    public void setNplazas(int nplazas) {
        this.nplazas = nplazas;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
}
