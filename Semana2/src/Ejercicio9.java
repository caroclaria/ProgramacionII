
import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ejercicio 9: Costo de envio y total de compra");
        
        double precioProducto, peso;
        String zona;
        System.out.println("Ingrese el precio del producto;");
        precioProducto = Double.parseDouble(input.nextLine());
           
        System.out.println("Ingrese el peso del producto:");
        peso = Double.parseDouble(input.nextLine());
            
        System.out.println("Ingrese la zona a enviar: internacional o nacional");
        zona = input.nextLine().toLowerCase();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
       
        
        System.out.println("el Costo total del producto es: " + calcularTotalCompra(precioProducto, costoEnvio));
        
        }
    static double calcularCostoEnvio (double peso, String zona){
        double costoEnvio;
        if (zona == "nacional") {
            costoEnvio= peso* 5;
        } else {
            costoEnvio = peso *10;
        }
        return costoEnvio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
