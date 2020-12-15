package mx.com.gm.peliculas.domain;

//Clases de dominio tambien llamadas clases de entidad
public class Pelicula {
    
    //Vamos aplicar el concepto de java bean
    private String nombre;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }  
         
}
