package Banco;

public class TestUsuario {

    public static void main(String[]args){
        Usuario Pablo = new Usuario("Pablo",159357,700);
        Usuario Pedro = new Usuario("Pedro",951753,1000);
        Pablo.consultarSaldo();
    }

}
