//221256 - Ovando Gómez
package com.upchiapas.pizzeria.models;

public class Pizza {
    
    private String id;
    private String especialidad;
    private double precio;

    public Pizza(String especialidad, double precio) {
    	this.precio =  precio;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
