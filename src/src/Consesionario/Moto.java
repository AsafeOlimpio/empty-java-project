package Consesionario;

public class Moto extends Vehiculo{
    //Attributes
    private String nombre;
    private int cilindrada;

    //Extended & Class Constructors


    public Moto(String matricula, String color, boolean isreserved, double precio, String nombre, int cilindrada) {
        super(matricula, color, isreserved, precio);
        this.nombre = nombre;
        this.cilindrada = cilindrada;
    }

    public Moto(String matricula, String color, boolean isreserved, double precio) {
        super(matricula, color, isreserved, precio);
    }

    //To String


    @Override
    public String toString() {
        return "Moto{" +
                "nombre='" + nombre + '\'' +
                ", cilindrada=" + cilindrada +
                '}';
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
