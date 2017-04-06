package com.oscarolivos.recyclerandcardviews;

/**
 * Created by ojo on 30/03/17.
 */

public class Juego {

    private  String titulo ;
    private String desarrolllador;
    private String fecha;

    public Juego(String titulo, String desarrolllador, String fecha) {
        this.titulo = titulo;
        this.desarrolllador = desarrolllador;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesarrolllador() {
        return desarrolllador;
    }

    public void setDesarrolllador(String desarrolllador) {
        this.desarrolllador = desarrolllador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
