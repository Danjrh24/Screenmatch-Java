package com.danielrodriguez.screenmatch.modelos;

public class Serie extends Titulo {

    //Atributos de serie

    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //Constructor super

    public Serie(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan) {
        super(nombre, fechaDeLanzamiento, incluidoEnElPlan);
    }

    //Setters y getters

    public void setTemporadas(int temporadas) { this.temporadas = temporadas; }
    public int getTemporadas() { return temporadas; }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) { this.episodiosPorTemporada = episodiosPorTemporada;}
    public int getEpisodiosPorTemporada() { return episodiosPorTemporada; }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) { this.minutosPorEpisodio = minutosPorEpisodio; }
    public int getMinutosPorEpisodio() { return minutosPorEpisodio; }

    @Override
    public int getDuracionEnMinutos() {
        return minutosPorEpisodio * episodiosPorTemporada * temporadas;
    }
}
