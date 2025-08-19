
import java.util.Scanner;



public class Ejercicio8 {
        public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Ejercicio 8: Calculo precio final");
           double precioBase, impuesto, descuento;

           System.out.println("Ingrese el precio base del producto;");
           precioBase = Double.parseDouble(input.nextLine());
           
           System.out.println("Ingrese el impuesto:");
           impuesto = Double.parseDouble(input.nextLine());
            
           System.out.println("Ingrese el descuento:");
           descuento = Double.parseDouble(input.nextLine());
           
            System.out.println(calcularPrecioFinal(impuesto, descuento, precioBase));
        }
        static double calcularPrecioFinal(double impuesto, double descuento, double precioBase){
            double precioFinal = precioBase + (precioBase * impuesto /100) - (precioBase * descuento /100);
            return precioFinal;
        }
}
