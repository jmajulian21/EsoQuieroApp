package com.trabajo.utn.trabajo_practico.modelos.clases;

/**
 * Created by julian.moreno on 9/25/2016.
 */
public class Categoria {
    private String nombre;
    private String descripcion;

    public Categoria(){}
    public Categoria(String nombre,String descripcion) {

        this.nombre=nombre;
        this.descripcion=descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}