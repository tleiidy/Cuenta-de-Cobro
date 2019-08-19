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
 * @author Gerard Amortegui
 * @author Brayan Diaz
 */
@ManagedBean
@RequestScoped
/**
 * clase de tipo ManagedBean creada para obtener los datos desde la vista
 */
public class Obtener implements Serializable {
    /**variable que almacena el nombre*/
    private String nombre;
    /**variable que almacena el sueldo*/
    private float sueldo;
    /**variable que almacena el numero de dias*/
    private int dias;
    /**vector que almacena los idiomas*/
    private String[] idiomas;
 
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
    /**
     * metodo get que obtiene el objeto persona
     */
    public Persona getPersona() {
        return persona;
    }
    /**
     * metodo set que modifica el objeto persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    /**
     * Creacion del objeto persona en memoria
     */
    Persona persona = new Persona(nombre,sueldo,dias,idiomas);
    
}
