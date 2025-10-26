package com.danielrodriguez.screenmatch.modelos;

public class Episodio {

    private int numeroDeEpisodio;
    private String nombredeEpisodio;
    private Serie serie;

    public void setNombredeEpisodio(String nombredeEpisodio) { this.nombredeEpisodio = nombredeEpisodio; };
    public String getNombredeEpisodio() { return nombredeEpisodio; };

    public void setNumeroDeEpisodio(int numeroDeEpisodio) { this.numeroDeEpisodio = numeroDeEpisodio; };
    public int getNumeroDeEpisodio() { return numeroDeEpisodio; };

    public void setSerie(Serie serie) { this.serie = serie; }
    public Serie getSerie() { return serie; }

}

