package Consesionario;

public class Pruebas {
    public static void main(String[]args){
    //Creamos el consesionario
    Consesionario Consesionario1 = new Consesionario("Audi Concessionaire","Calle Maria",985589631);

    //Creamos los coches instanciados como vehiculos "polimorfismo"
    Vehiculo Car1 = new Coche("6UKR 35","Azul",false,20680,"Audi A1",5,"Turbo");
        Vehiculo Car2 = new Coche("392 ASC","Negro",false,2500000,"Koeniseng",4,"Turbo");
        //Vehiculo Car3 = new Coche("356 ASC","Negro",false,2500000,"Coche3",4,"Turbo");

    //Creamos las motos instanciadas como vehiculos "polimorfismo"
    Vehiculo Moto1 = new Moto("445 AVL","Morado",false,9350,"HD - Iron 883™",883);
        Vehiculo Moto2 = new Moto("311 AFX","Verde",true,23310,"HD - Softail™",1745);
        Vehiculo Moto3 = new Moto("182 AJG","Azul",false,12820,"HD - Sportster Forty-Eight™",1202);

    //Añadimos los coches y las motos

        Consesionario1.addVehiculo(Car1);
        Consesionario1.addVehiculo(Car2);
        //Consesionario1.addVehiculo(Car3);

        Consesionario1.addVehiculo(Moto1);
        Consesionario1.addVehiculo(Moto2);
        Consesionario1.addVehiculo(Moto3);




        //Reserva de vehículos por matricula, "Moto2 ya está reservada y nos devolverá un mensaje avisandonos"

//    Car1.reservar("6UKR 35");
//    Moto1.reservar("445 AVL");
//    Moto2.reservar("311 AFX");
//
//    //Mostrar Consesionario
//
    System.out.println(Consesionario1);
//    System.out.println("\n");
//
//    //Mostrar Coches - Ejemplo
//        //System.out.println(Car2);
//        System.out.println("\n");
//        //((Coche) Car2).csM("392 ASC");
//        String matricula = "392 ASD";
//        //System.out.println(CO);
//        try {
//            Consesionario1.buscar("392 ASC");
//        } catch (Exception e) {
//            System.out.println("El coche de matrícula: " + matricula + " No existe o el nuúmero de matrícula: " + matricula +
//                    " está mal");
//        }
    }
}
