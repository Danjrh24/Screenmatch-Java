import com.danielrodriguez.screenmatch.modelos.Pelicula;
import com.danielrodriguez.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Batman Begins", 2005,  true);
        miPelicula.setDuracionEnMinutos(140);
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(9);
        miPelicula.setDirector("Christopher Nolan");
        miPelicula.muestraFichaTecnica("pelicula");

        System.out.println("************************************");

        Serie miSerie = new Serie("Game of Thrones", 2011, true);
        miSerie.setTemporadas(8);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.evalua(10);
        miSerie.evalua(7);
        miSerie.evalua(8);
        miSerie.muestraFichaTecnica("serie");
    }
}