package com.danielrodriguez.screenmatch.modelos;

public class Titulo {

    //Atributos de titulo

    private String nombre;
    private int fechaDeLanzamiento;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;
    private int duracionEnMinutos;

    //Constructor

    public Titulo(String nombre, int fechaDeLanzamiento, boolean incluidoEnElPlan){
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //Setters y getters

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) { this.fechaDeLanzamiento = fechaDeLanzamiento; }
    public int getFechaDeLanzamiento() { return fechaDeLanzamiento; }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) { this.incluidoEnElPlan = incluidoEnElPlan; }
    public boolean getIncluidoEnElPlan() { return incluidoEnElPlan; }

    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }
    public int getDuracionEnMinutos() { return duracionEnMinutos; }

    //Acciones o metodos

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    public double calculaLaMediaDeEvaluaciones(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(Titulo titulo){
        if(titulo.getClass().equals(Pelicula.class)){
            System.out.println("\nNombre de la pelicula: " + nombre);
            System.out.println("Director(a): " + ((Pelicula) titulo).getDirector());
        }else if (titulo.getClass().equals(Serie.class)){
            System.out.println("\nNombre de la serie: " + nombre);
            System.out.println("Cantidad de temporadas: " + ((Serie) titulo).getTemporadas());
            System.out.println("Cantidad de episodios por temporada: " + ((Serie) titulo).getEpisodiosPorTemporada());
            System.out.println("Duracion de episodios en minutos: " + ((Serie) titulo).getMinutosPorEpisodio());
        }
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion total en minutos: " + getDuracionEnMinutos());
        System.out.println("Esta incluida en el plan: " + incluidoEnElPlan);
        System.out.printf(String.format("Media de valoraciones: %.1f\n", calculaLaMediaDeEvaluaciones()));
    }
}
