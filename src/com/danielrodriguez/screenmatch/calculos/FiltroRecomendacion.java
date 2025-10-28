package com.danielrodriguez.screenmatch.calculos;

public class FiltroRecomendacion {

    public String filtra(Clasificacion clasificacion) {
        if(clasificacion.getClasificacion() >= 4){
            return "Muy bien valorado en el momento";
        } else if (clasificacion.getClasificacion() >= 2) {
            return "Bien valorado en el momento";
        } else {
            return "Añadelo a tu lista de ver más tarde";
        }
    }

}
