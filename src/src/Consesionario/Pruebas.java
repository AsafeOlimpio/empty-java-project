package Consesionario;

public class Pruebas {
    public static void main(String[]args){
    Consesionario Consesionario1 = new Consesionario("Audi","Calle Maria",985589631);
    Coche Car1 = new Coche("A85904561Y","Azul",false,1500,"Audi A1",5,"Turbo");
    Consesionario1.addVehiculo(Car1);
    System.out.println(Consesionario1);
    }
}
