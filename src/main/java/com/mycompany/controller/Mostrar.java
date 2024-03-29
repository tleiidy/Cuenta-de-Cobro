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
 * @author Leidy Torres
 */
@ManagedBean
@RequestScoped
/**
 * clase de tipo ManagedBean creada para mostrar los datos en la vista
 */
public class Mostrar implements Serializable {
    /**
     * Propiedad utilizada para obtener los datos del ManagedBean identificado como obtener
     */
    @ManagedProperty("#{obtener}")
    /**
     * Creacion del objeto para acceder a los datos
     */
    private Obtener datos;
    
    public Mostrar() {
    }
    /**
     * metodo get que obtiene los datos del ManagedBean identificado como obtener
     */
    public Obtener getDatos() {
        return datos;
    }
    /**
     * metodo set que modifica los datos del ManagedBean identificado como obtener
     */
    public void setDatos(Obtener datos) {
        this.datos = datos;
    }
    /**
     * Metodo creado para mostar los datos que llegan desde el ManagedBean identificado como obtener
     * @return 
     */
    public String resultado(){
        //return "Querido usuario "+datos.getNombre()+" segun su sueldo que es: "+datos.getSueldo()+" y segun los dias trabajados que son: "+ datos.getDias()+" y los idiomas que escogio su nomina es: "+datos.persona.sueldoTotal(datos.getProfesion(), datos.getIdiomas(), datos.getUbicacion(), datos.getDias(), datos.getSueldo());
        if(datos.getGenero().equals("Femenino")){
            return "Señora "+datos.getNombre()+" "+datos.getApellido()+
                    " \npor su profesion "+ datos.getProfesion()[0]+" y su idioma "+
                    datos.getIdiomas()[0]+" ,su ubicación en "+datos.getUbicacion()+
                    " y dias trabajados "+datos.getDias()+" su cuenta de cobro es: "+datos.persona.sueldoTotal(datos.getProfesion(), datos.getIdiomas(), datos.getUbicacion(), datos.getDias(), datos.getSueldo());
        }else if(datos.getGenero().equals("Masculino")){
            return "Señor "+datos.getNombre()+" "+datos.getApellido()+" por su profesion "+ datos.getProfesion()[0]
                    +" y su idioma "+datos.getIdiomas()[0]+" ,su ubicación en "+datos.getUbicacion()
                    +" y dias trabajados "+datos.getDias()+" su cuenta de cobro es: "+datos.persona.sueldoTotal(datos.getProfesion(), datos.getIdiomas(), datos.getUbicacion(), datos.getDias(), datos.getSueldo());
        }else {
            return "Señor usuario "+datos.getNombre()+" "+datos.getApellido()+" por su profesion "+datos.getProfesion()[0]
                    +" y su idioma "+datos.getIdiomas()[0]+" ,su ubicación en "+datos.getUbicacion()
                    +" y dias trabajados "+datos.getDias()+" su cuenta de cobro es: "+datos.persona.sueldoTotal(datos.getProfesion(), datos.getIdiomas(), datos.getUbicacion(), datos.getDias(), datos.getSueldo());
        }
    }
    
}
