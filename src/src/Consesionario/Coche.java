package Consesionario;

public class Coche extends Vehiculo {
    //Attributes
    private String nombre;
    private int nplazas;
    private String extras;

    //Extended & Class COnstructors


    public Coche(String matricula, String color, boolean isreserved, double precio, String nombre, int nplazas, String extras) {
        super(matricula, color, isreserved, precio);
        this.nombre = nombre;
        this.nplazas = nplazas;
        this.extras = extras;
    }

    //To String
    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", nplazas=" + nplazas +
                ", extras='" + extras + '\'' +
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
