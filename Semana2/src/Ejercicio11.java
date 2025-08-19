
import java.util.Scanner;



public class Ejercicio11 {
    public static double descuentoGlobal = 0.9;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ejercicio 11: calculo descuento");
        double precio;
        System.out.println("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.println("El precio final con descuento es: " + calcularDescuentoEspecial(precio));
        }
    static double calcularDescuentoEspecial (double precio){
        double descuentoAplicado = descuentoGlobal;
        double precioFinal = precio * descuentoAplicado;
        return precioFinal;
    }
}
