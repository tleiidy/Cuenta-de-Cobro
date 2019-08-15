/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.*;

/**
 *
 * @author tegui
 */
@ManagedBean(name = "mostrar")
@RequestScoped
public class Mostrar implements Serializable {

    @ManagedProperty("#{obtener}")
    private Obtener datos;
    
    public Mostrar() {
    }

    public Obtener getDatos() {
        return datos;
    }

    public void setDatos(Obtener datos) {
        this.datos = datos;
    }
    
    public String resultado(){
        return "Querido usuario "+datos.getNombre()+" segun su sueldo que es: "+datos.getSueldo()+" y segun los dias trabajados que son: "+ datos.getDias()+" y los idiomas que escogio su nomina es: "+datos.persona.sueldoTotal(datos.getSueldo(), datos.getDias(), datos.getIdiomas());
    }
    
}
