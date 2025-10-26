package com.danielrodriguez.screenmatch.calculos;
import com.danielrodriguez.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    //Incluye la duracion en minutos de un titulo al tiempo total

    public void incluyeTitulo(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    //Obtiene el tiempo total de los titulos

    public int getTiempoTotal(){
        return this.tiempoTotal;
    }

}
