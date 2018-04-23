package Matrix;

public class mainMatriz {
    public static void main(String[]args){
        Matrix m1 = new Matrix();
        Matrix m2 = new Matrix();
        int [] v1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int [] v2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
        m1.asignarDatos(v1);
        m2.asignarDatos(v2);
        System.out.println("Matriz 1: ");
        m1.suma(m2);
        m1.producto(m2);
        m1.mostrar();
    }

}
