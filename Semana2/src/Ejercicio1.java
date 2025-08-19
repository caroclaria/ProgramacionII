
import java.util.Scanner;



public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1: verificacion año bisiesto");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int anio = Integer.parseInt(input.nextLine());
        if ((anio %4 == 0 && anio %100 !=0) || anio %400 ==0) {
            System.out.println("El año ingresado: " + anio + " es bisiesto");
        }else {
            System.out.println("el año ingresado: " + anio + " no es bisiesto");
        }
    }
    
}
