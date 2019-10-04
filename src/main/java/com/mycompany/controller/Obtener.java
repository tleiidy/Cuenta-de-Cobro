/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Persona;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Leidy Torres
 */
@ManagedBean
@RequestScoped
/**
 * clase de tipo ManagedBean creada para obtener los datos desde la vista
 */
public class Obtener implements Serializable {
    /**variable que almacena el nombre*/
    private String nombre;
    private String apellido;
    private String[] profesion;
    private String genero;
    private String[] idiomas;
    private String ubicacion;
    private int dias;
    /**variable que almacena el sueldo*/
    private float sueldo;
     
    public Obtener() {
        
    }
    /**
     * metodo get que obtiene la variable nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * metodo set que modifica la variable nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo get que obtiene la variable sueldo
     */
    public float getSueldo() {
        return sueldo;
    }
    /**
     * metodo set que modifica la variable sueldo
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * metodo get que obtiene la variable dias
     */
    public int getDias() {
        return dias;
    }
    /**
     * metodo set que modifica la variable dias
     */
    public void setDias(int dias) {
        this.dias = dias;
    }
    /**
     * metodo get que obtiene el vector idiomas
     */
    public String[] getIdiomas() {
        return idiomas;
    }
    /**
     * metodo set que modifica el vector idiomas
     */
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getProfesion() {
        return profesion;
    }

    public void setProfesion(String[] profesion) {
        this.profesion = profesion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
    /**
     * metodo get que obtiene el objeto persona
     */
    public Persona getPersona() {
        return persona;
    }
    /**
     * 
     * @param persona 
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    /**
     * Creacion del objeto persona en memoria
     */
    Persona persona = new Persona(nombre,apellido,profesion,genero,idiomas,ubicacion,dias,sueldo);
    
}
