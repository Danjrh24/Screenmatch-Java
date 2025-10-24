
public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;

    void MuestraFichaTecnica(){
        System.out.println("\nEl nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
        System.out.println("Esta incluida en el plan: " + incluidoEnElPlan);
        System.out.printf(String.format("Su media de valoraciones es: %.1f\n", calculaLaMediaDeEvaluaciones()));
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaLaMediaDeEvaluaciones(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }
}
