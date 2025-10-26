import com.danielrodriguez.screenmatch.calculos.CalculadoraDeTiempo;
import com.danielrodriguez.screenmatch.calculos.FiltroRecomendacion;
import com.danielrodriguez.screenmatch.modelos.Episodio;
import com.danielrodriguez.screenmatch.modelos.Pelicula;
import com.danielrodriguez.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        CalculadoraDeTiempo calcularTiempoTotal = new CalculadoraDeTiempo();

        Pelicula miPelicula = new Pelicula("Batman Begins", 2005,  true);
        miPelicula.setDuracionEnMinutos(140);
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(9);
        miPelicula.setDirector("Christopher Nolan");
        miPelicula.muestraFichaTecnica(miPelicula);
        filtroRecomendacion.filtra(miPelicula);

        System.out.println("************************************");

        Serie miSerie = new Serie("Game of Thrones", 2011, true);
        miSerie.setTemporadas(8);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(50);
        miSerie.evalua(10);
        miSerie.evalua(7);
        miSerie.evalua(8);
        miSerie.muestraFichaTecnica(miSerie);
        filtroRecomendacion.filtra(miSerie);

        System.out.println("\n**************************************\n");

        Episodio episodio1 = new Episodio();
        episodio1.setSerie(miSerie);
        episodio1.setNombredeEpisodio("Winter is coming");
        episodio1.setLikes(500);
        episodio1.setNumeroDeEpisodio(1);
        filtroRecomendacion.filtra(episodio1);
        System.out.println("\n**************************************\n");

        calcularTiempoTotal.incluyeTitulo(miPelicula);
        calcularTiempoTotal.incluyeTitulo(miSerie);
        System.out.println("El tiempo total requerido para ver todos los contenidos es de " +
                calcularTiempoTotal.getTiempoTotal() + " minutos");

    }
}