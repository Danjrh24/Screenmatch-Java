package com.danielrodriguez.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion) {
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien valorado en el momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Bien valorado en el momento");
        } else {
            System.out.println("Añadelo a tu lista de ver más tarde");
        }
    }

}
