
import java.util.Scanner;



public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6: Contador");
        Scanner input = new Scanner(System.in);
        
        int num, positivos =0 , negativos = 0, ceros = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero entero");
            num = Integer.parseInt(input.nextLine());
            
            if (num == 0) {
                ceros = ceros +1;
            } else {
                if(num <0) {
                    negativos = negativos + 1;
                } else {
                    positivos = positivos +1;
                }
            }

        }
        System.out.println("La suma de los numeros es: \n positivos: " + positivos + " \nNegativos: " + negativos + "\nCeros: " + ceros);
}
}

