import com.danielrodriguez.screenmatch.calculos.CalculadoraDeTiempo;
import com.danielrodriguez.screenmatch.modelos.Episodio;
import com.danielrodriguez.screenmatch.modelos.Pelicula;
import com.danielrodriguez.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CalculadoraDeTiempo calcularTiempoTotal = new CalculadoraDeTiempo();

        Pelicula pelicula_1 = new Pelicula("Batman Begins", 2005,  true);
        pelicula_1.setDuracionEnMinutos(140);
        pelicula_1.evalua(10);
        pelicula_1.evalua(8.5);
        pelicula_1.evalua(9);
        pelicula_1.setDirector("Christopher Nolan");
        pelicula_1.muestraFichaTecnica(pelicula_1, pelicula_1);

        Pelicula pelicula_2 = new Pelicula("Transformers", 2007, true);
        Pelicula pelicula_3 = new Pelicula("Avengers", 2012, true);

        System.out.println("\n************************************\n");

        Serie miSerie = new Serie("Game of Thrones", 2011, true);
        miSerie.setTemporadas(8);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.evalua(10);
        miSerie.evalua(7);
        miSerie.evalua(8);
        miSerie.muestraFichaTecnica(miSerie, miSerie);

        System.out.println("\n**************************************\n");

        Episodio episodio1 = new Episodio();
        episodio1.setSerie(miSerie);
        episodio1.setNombredeEpisodio("Winter is coming");
        episodio1.setLikes(500);
        episodio1.setNumeroDeEpisodio(1);
        calcularTiempoTotal.incluyeTitulo(pelicula_1);
        calcularTiempoTotal.incluyeTitulo(miSerie);
        System.out.println("El tiempo total requerido para ver todos los contenidos es de " +
                calcularTiempoTotal.getTiempoTotal() + " minutos");

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(pelicula_1);
        listaDePeliculas.add(pelicula_2);
        listaDePeliculas.add(pelicula_3);

        System.out.println("Numero de peliculas: " + listaDePeliculas.size());
        System.out.println("Primera pelicula: " + listaDePeliculas.getFirst().getNombre());
        System.out.println("Ultima pelicula: " + listaDePeliculas.getLast().getNombre());

    }
}