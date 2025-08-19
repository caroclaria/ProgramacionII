
import java.util.Scanner;



public class Ejercicio4 {
     public static void main(String[] args) {
        System.out.println("Ejercicio 4: Calculadora de descuento");
        Scanner input = new Scanner(System.in);
        double precio, precioFinal;
        String categoria;
        
        System.out.println("Ingrese Precio");
        precio = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese Categoria (A,B,C)");
        categoria = input.nextLine();
        
         switch (categoria.toLowerCase()) {
             case "a":
                System.out.println("Descuento aplicado: 10%");
                precioFinal = precio * 0.9;
                System.out.println("Precio final: " + precioFinal);
                break;
            case "b":
                System.out.println("Descuento aplicado: 15%");
                precioFinal = precio * 0.85;
                System.out.println("Precio final: " + precioFinal);
                break;
            case "c":
                System.out.println("Descuento aplicado: 20%");
                precioFinal = precio * 0.8;
                System.out.println("Precio final: " + precioFinal);
                 break;
             default:
                 System.out.println("No ha ingresado una categoria correcta");
                 
         }
}}
