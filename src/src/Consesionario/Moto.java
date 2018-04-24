package Consesionario;

public class Moto extends Vehiculo{
    //Attributes
    private int cilindrada;

    //Extended & Class Constructors
    public Moto(String matricula, String color, boolean isreserved, double precio, int cilindrada) {
        super(matricula, color, isreserved, precio);
        this.cilindrada = cilindrada;
    }

    public Moto(String matricula, String color, boolean isreserved, double precio) {
        super(matricula, color, isreserved, precio);
    }

    //To String
    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                '}';
    }

    //Getters & Setters
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
