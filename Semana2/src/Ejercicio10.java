
import java.util.Scanner;



public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ejercicio 10: Actualizacion de stock");
        
        int stockActual, cantidadVendida, cantidadRecibida;
        System.out.println("Ingrese stock actual: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese cantidad vendida: ");
        cantidadVendida = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese cantidad recibida: ");
        cantidadRecibida = Integer.parseInt(input.nextLine());
        
        System.out.println("el nuevo stock de producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
        
        }
    
    
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
    int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
    return nuevoStock;
}
}
