package com.danielrodriguez.screenmatch.modelos;

public class Serie extends Titulo {

    //Atributos de serie

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan) {
        super(nombre, fechaDeLanzamiento, duracionEnMinutos, incluidoEnElPlan);
    }

    //Setters y getters

    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }
    public int getTemporadas() { return temporadas; }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { this.episodiosPorTemporada = episodiosPorTemporada;}
    public int getEpisodiosPorTemporada() { return episodiosPorTemporada; }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) { this.minutosPorEpisodio = minutosPorEpisodio; }
    public int getMinutosPorEpisodio() { return minutosPorEpisodio; }
}
