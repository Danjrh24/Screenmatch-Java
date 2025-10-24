package com.danielrodriguez.screenmatch.modelos;

public class Pelicula extends Titulo{

    private String director;

    public Pelicula(String nombre, int fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        super(nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }

    public void setDirector(String director) { this.director = director; }

    public String getDirector() { return director; }
}
