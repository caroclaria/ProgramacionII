
import java.util.Scanner;



public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7: Validador notas");
        Scanner input = new Scanner(System.in);
        int nota;
        do {            
            System.out.println("Ingrese una nota entre 0 y 10:");
            nota = Integer.parseInt(input.nextLine());
             if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota <0 ||nota > 10 );
        System.out.println("Nota guardada correctamente");
}
}
