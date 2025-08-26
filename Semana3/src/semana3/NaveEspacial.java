
package semana3;

public class NaveEspacial {
    //metodos
    private String nombre;
    private int combustible;
    
    //constructor
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    //metodos
    public void despegar(){
        System.out.println("Despegando...");
    }
    
    public void avanzar(int distancia){
        if (combustible > distancia) {
            combustible -=distancia;
            System.out.println("Avanzando " + distancia + " km");
        } else {
            System.out.println("no se puede avanzar por falta de combustible");
        }
    }
    
    public void recargarCombustible(int cantidad){
        if (combustible > 50) {
            System.out.println("No se puede recargar, el tanque esta lleno");
        } else {
            combustible +=cantidad;
            System.out.println("La nueva cantidad de combustible es: " + combustible);
        }
        }
        public void mostrarEstado(){
            System.out.println("nombre: " + nombre + " cantidad de combustible: " + combustible); 
        }
    
}
