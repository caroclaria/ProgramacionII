
import java.util.Scanner;



public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Suma de numeros pares");
        Scanner input = new Scanner(System.in);
        
        int num,sumaPares = 0;
        do {            
            System.out.println("Ingrese un numero: 0 si desea terminar");
            num = Integer.parseInt(input.nextLine());
            if (num %2 == 0) {
                sumaPares = sumaPares + num;
            }
        } while (num!=0);
        System.out.println("La suma de los numeros pares ingresados es: " + sumaPares);
        

        
               
        
   }
     
}
