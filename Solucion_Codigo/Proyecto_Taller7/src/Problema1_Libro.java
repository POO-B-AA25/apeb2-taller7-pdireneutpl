import java.util.ArrayList;
public class Problema1_Libro {
    
}
class SoportePelicula{
    public double precioAlq;
    public SoportePelicula(double precioAlq) {
        this.precioAlq = precioAlq;
    }
    public String toString() {
        return "SoportePelicula{" + "precioAlq=" + precioAlq + '}';
    }
}
class DVD extends SoportePelicula{
    public String idiomas[];
    public ArrayList<Pelicula> listaPeliculas;
    public DVD(String[] idiomas, ArrayList<Pelicula> listaPeliculas, double precioAlq) {
        super(precioAlq);
        this.idiomas = idiomas;
        this.listaPeliculas = listaPeliculas;
    }
    public void calcularCostoAlq(){
        this.precioAlq += this.precioAlq * 0.1;
    }
    public String toString() {
        return "DVD{" + "idiomas=" + idiomas + ", listaPeliculas=" + listaPeliculas + '}';
    }
}
class VHS extends SoportePelicula{
    public String idioma;
    public Pelicula pelicula;
    public VHS(String idioma, Pelicula pelicula, double precioAlq) {
        super(precioAlq);
        this.idioma = idioma;
        this.pelicula = pelicula;
    }
    public String toString() {
        return "VHS{" + "idioma=" + idioma + ", pelicula=" + pelicula + '}';
    }
}
class Pelicula{
    public String titulo, autor;
    public int anioEdicion;
    public Pelicula(String titulo, String autor, int anioEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
    }
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", autor=" + autor + ", anioEdicion=" + anioEdicion + '}';
    }
}
