
import java.util.Scanner;



public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ejercicio 13: Modificacion de array");
        double[] precios = {199.99,299.5,149.75,399.0,89,9};
        
        System.out.println("Precios originales");
        mostrarArray(precios,0);

        precios[2] = 129.99;
        System.out.println("precios modificados");
        mostrarArray(precios,0);
        
    }
    static void mostrarArray(double[] array, int i){
        if (i >= array.length) {
            return;
        } else {
            System.out.println(array[i]);
            mostrarArray(array, i+1);
        }
    }
}
