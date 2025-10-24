import com.danielrodriguez.screenmatch.modelos.Pelicula;

public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Batman Begins", 2005, 140, true);
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(9);
        miPelicula.muestraFichaTecnica("pelicula");

        System.out.println("************************************");

        Pelicula otraPelicula = new Pelicula("Spiderman", 2002, 126, false);
        otraPelicula.evalua(10);
        otraPelicula.evalua(9);
        otraPelicula.evalua(10);
        otraPelicula.muestraFichaTecnica("serie");

    }
}