
package semana3;


public class Mascota {
    //atributos
    private String nombre, especie;
    private int edad;
    //constructor
    public Mascota(String nombre, String especie, int edad){
        this.nombre =nombre;
        this.especie = especie;
        this.edad = edad;
    }
    //metodos
    public void mostrarInfo(){
        System.out.println("nombre : " + nombre + " especie: " + especie + " edad: " + edad);
    }
    public void cumplirAnios(){
        edad +=1;
    }
    
    
}
