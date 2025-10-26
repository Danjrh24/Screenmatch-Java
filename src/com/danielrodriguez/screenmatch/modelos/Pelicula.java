package com.danielrodriguez.screenmatch.modelos;

public class Pelicula extends Titulo{

    //Atributos de pelicula

    private String director;

    //Constructor super

    public Pelicula(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan) {
        super(nombre, fechaDeLanzamiento, incluidoEnElPlan);
    }

    //setters y getters

    public void setDirector(String director) { this.director = director; }
    public String getDirector() { return director; }


}
