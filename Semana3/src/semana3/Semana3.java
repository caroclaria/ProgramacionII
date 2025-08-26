
package semana3;


public class Semana3 {

    public static void main(String[] args) {
        //1 reigstro de estudiantes
        Estudiante estudiante1 = new Estudiante("Juan", "Lopez", "programacion", 8);
        //mostrar info
        estudiante1.mostrarInfo();
        //subir calificacion
        estudiante1.subirCalificacion(1);
        estudiante1.mostrarInfo();
        //bajar calificacion
        estudiante1.bajarCalificacion(1.5);
        estudiante1.mostrarInfo();
        
        
        //2 Reigstro de mascotas
        Mascota mascota1 = new Mascota("feli", "gato" , 3);
        mascota1.mostrarInfo();
        //paso del tiempo
        mascota1.cumplirAnios();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
        
        
        //3 Libro
        Libro libro1 = new Libro("Amigos felices", "Jose rodriguez", 1960);
        //modificar año con valor incorrecto
        libro1.setAnioPublicacion(2026);
        libro1.getAnioPublicacion();
        libro1.setAnioPublicacion(1978);
        libro1.getAnioPublicacion();
        
        //4 Gallinas
        Gallina gallina1 = new Gallina (1,1,1);
        Gallina gallina2 = new Gallina (2,1,1);
        //acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //5 Nave espacial
        NaveEspacial naveEspacial1= new NaveEspacial("rupi", 2);
        naveEspacial1.avanzar(4);
        naveEspacial1.recargarCombustible(30);
        naveEspacial1.avanzar(5);
        naveEspacial1.mostrarEstado();
  }
      
}
