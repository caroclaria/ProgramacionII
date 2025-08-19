
import java.util.Scanner;



public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Clasificacion de edad");
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Niño");
        } else  if(edad >= 12 && edad <=17){
            System.out.println("Adolescente");
        } else if (edad >=18 && edad <=59){
            System.out.println("Adulto");
        }else {
            System.out.println("Adulto mayor");

        }
        }

}
