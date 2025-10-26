package com.danielrodriguez.screenmatch.modelos;
import com.danielrodriguez.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    //Atributos

    private int numeroDeEpisodio;
    private String nombredeEpisodio;
    private Serie serie;
    private int likes;

    //Setters y getters

    public void setNombredeEpisodio(String nombredeEpisodio) { this.nombredeEpisodio = nombredeEpisodio; }
    public String getNombredeEpisodio() { return nombredeEpisodio; }

    public void setNumeroDeEpisodio(int numeroDeEpisodio) { this.numeroDeEpisodio = numeroDeEpisodio; }
    public int getNumeroDeEpisodio() { return numeroDeEpisodio; }

    public void setSerie(Serie serie) { this.serie = serie; }
    public Serie getSerie() { return serie; }

    public void setLikes(int likes) { this.likes = likes; }
    public int getLikes() { return likes; }

    //Aciones o metodos

    @Override
    public int getClasificacion() {
        if(likes >= 200) {
            return 4;
        } else if (likes >= 100) {
            return 3;
        }else {
            return 2;
        }
    }
}

