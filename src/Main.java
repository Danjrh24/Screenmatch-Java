
public class Main {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Batman begins";
        miPelicula.fechaDeLanzamiento = 2007;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.incluidoEnElPlan = true;
        miPelicula.evalua(10);
        miPelicula.evalua(8.5);
        miPelicula.evalua(9);
        miPelicula.MuestraFichaTecnica();

    }
}