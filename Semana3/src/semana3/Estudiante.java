
package semana3;

public class Estudiante {
    private String nombre, apellido, curso;
    private double calificacion;
    
    //constructor
    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("nombre completo: " + nombre + apellido + " curso: " + curso + " calificacion: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){ 
        calificacion = calificacion + puntos;
    }
    public void bajarCalificacion(double puntos){ 
        calificacion = calificacion - puntos;
    }
}
