package com.danielrodriguez.screenmatch.modelos;

public class Titulo {

    //Atributos de titulo

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    //Constructor

    public Titulo(String nombre, int fechaDeLanzamiento, int duracionEnMinutos, boolean incluidoEnElPlan){
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.duracionEnMinutos = duracionEnMinutos;
        this. incluidoEnElPlan = incluidoEnElPlan;
    }

    //Setters y getters

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNombre() { return nombre; }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) { this.fechaDeLanzamiento = fechaDeLanzamiento; }

    public int getFechaDeLanzamiento() { return fechaDeLanzamiento; }

    public void setDuracionEnMinutos(int duracionEnMinutos) { this.duracionEnMinutos = duracionEnMinutos; }

    public int getDuracionEnMinutos() { return duracionEnMinutos; }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) { this.incluidoEnElPlan = incluidoEnElPlan; }

    public boolean getIncluidoEnElPlan() { return incluidoEnElPlan; }

    //Acciones o metodos

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    private double calculaLaMediaDeEvaluaciones(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }

    public void muestraFichaTecnica(String tipoDetitulo){
        System.out.println("\nEl nombre de la " + tipoDetitulo + " es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
        System.out.println("Esta incluida en el plan: " + incluidoEnElPlan);
        System.out.printf(String.format("Su media de valoraciones es: %.1f\n", calculaLaMediaDeEvaluaciones()));
    }
}
