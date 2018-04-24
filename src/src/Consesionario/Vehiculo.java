package Consesionario;

public class Vehiculo {
    //Attributes
    private String matricula;
    private String color;
    private boolean isreserved;
    private double precio;

    //Constructor
    public Vehiculo(String matricula, String color, boolean isreserved, double precio) {
        this.matricula = matricula;
        this.color = color;
        this.isreserved = isreserved;
        this.precio = precio;
    }

    //To String

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", isreserved=" + isreserved +
                ", precio=" + precio +
                '}';
    }


    //Getters & Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIsreserved() {
        return isreserved;
    }

    public void setIsreserved(boolean isreserved) {
        this.isreserved = isreserved;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
