
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2: Mayor de tres numeros");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("ingrese el primer numero");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el segundo numero");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el tercer numero");
        num3 = Integer.parseInt(input.nextLine());
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num3);

            }
        } else {
            if (num2 > num3) {
                System.out.println("El mayor es: " + num2);
            } else {
                System.out.println("El mayor es: " + num3);

            }
        }
}
}
