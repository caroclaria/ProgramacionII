
package semana3;

public class Gallina {
    //atributos
    private int idGallina, edad, huevosPuestos;
    
    //constructor
    public Gallina(int idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
        
    }
    
    //metodos
    public void ponerHuevo(){
        huevosPuestos +=1;
    }
    
    public void envejecer(){
        edad +=1;
    }
    
    public void mostrarEstado(){
        System.out.println("Galina Id: " + idGallina + " Edad: " + edad + " Huevos puestos: " + huevosPuestos);
    }
}
