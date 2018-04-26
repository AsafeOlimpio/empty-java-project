package Consesionario;

public class Vehiculo {
    //Attributes
    private String matricula;
    private String color;
    private boolean isreserved;
    private double precio;

    //Constructor
    public Vehiculo(){}

    public Vehiculo(String matricula, String color, boolean isreserved, double precio) {
        this.matricula = matricula;
        this.color = color;
        this.isreserved = isreserved;
        this.precio = precio;

    }

                                                    /*Métodos*/

    //Método para reservar vehículos por matrícula
    public void reservar(String matricula) {
        if(isreserved = false){
            setIsreserved(true);
        }
        else if(isreserved = true){
            System.out.println("El coche ya está reservado");
        }
        else {System.out.println("El coche no está registrado o ha sido retirado");}
    }

    //Método Mostrar Segun Matrícula
    /*public void csM(String matricula){
        System.out.println(getClass());
    }*/

    //To String
    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", color='" + color + '\'' +
                ", isreserved=" + isreserved +
                ", precio=" + precio +"€"+
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

    public int compareTo(Vehiculo matricula){
       this.matricula = matricula
    }
}
