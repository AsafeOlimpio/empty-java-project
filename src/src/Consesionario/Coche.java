package Consesionario;

public class Coche extends Vehiculo {
    //Attributes
    private int nplazas;
    private String extras;

    //Extended & Class COnstructors
    public Coche(String matricula, String color, boolean isreserved, double precio) {
        super(matricula, color, isreserved, precio);
    }

    public Coche(String matricula, String color, boolean isreserved, double precio, int nplazas, String extras) {
        super(matricula, color, isreserved, precio);
        this.nplazas = nplazas;
        this.extras = extras;
    }

    //To String
    @Override
    public String toString() {
        return "Coche{" +
                "nplazas=" + nplazas +
                ", extras='" + extras + '\'' +
                '}';
    }

    //Getters & Setters
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
