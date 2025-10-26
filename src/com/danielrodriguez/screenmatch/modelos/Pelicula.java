package com.danielrodriguez.screenmatch.modelos;
import com.danielrodriguez.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    //Atributos de pelicula

    private String director;

    //Constructor super

    public Pelicula(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan) {
        super(nombre, fechaDeLanzamiento, incluidoEnElPlan);
    }

    //setters y getters

    public void setDirector(String director) { this.director = director; }
    public String getDirector() { return director; }

    //Metodos
    @Override
    public int getClasificacion() {
        return (int) calculaLaMediaDeEvaluaciones() / 2;
    }
}
