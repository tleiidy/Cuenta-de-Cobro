/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author Leidy Torres
 */

/**
* Clase creada con el fin de almacenar los datos mandados por el usuario desde la vista
*/
public class Persona {
    /**variable que almacena el nombre*/
    private String nombre;
    private String apellido;
    private String []profesion;
    private String genero;
    private String []idiomas;
    private String ubicacion;
    private int dias;
    private float sueldo;

    public Persona(String nombre, String apellido, String[] profesion, String genero, String[] idiomas, String ubicacion, int dias, float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.genero = genero;
        this.idiomas = idiomas;
        this.ubicacion = ubicacion;
        this.dias = dias;
        this.sueldo = sueldo;
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
     * Metodo que calcula el sueldo total en base a los datos ingresados por las persona mediante los siguiente parametros 
     * @param sueldo
     * @param dias
     * @param idiomas
     * @return 
     */
    public float sueldoTotal(float sueldo, int dias, String[] idiomas, String[]profesion, String ubicacion){
    
        float resultado = 0;
        if(profesion.equals("Ingeniero")){
                resultado = (sueldo + 2000000) * dias;
            }else if (profesion.equals("Tecnologo")){
                resultado = (sueldo + 1500000) * dias;
            }else if (profesion.equals("Tecnico")){
                resultado = (sueldo + 1000000) * dias;
            }else{
                resultado = (sueldo + 850000) * dias;
        }
        
        if(idiomas.length == 0){
            resultado = sueldo * dias;
        }
        else{
            resultado = sueldo*dias;
            for(int i=0 ; i<idiomas.length ; i++){
                if(idiomas[i].equals("ingles")){
                    resultado = resultado + 100000;
                }
                else if(idiomas[i].equals("espanol")){
                    resultado = resultado + 200000;
                }
                else if(idiomas[i].equals("frances")){
                    resultado = resultado + 300000;
                }
                else if(idiomas[i].equals("aleman")){
                    resultado = resultado + 500000;
                }
                
            }
        }
        
        return resultado;
    }

    public float sueldoTotal(String[]profesion, String[]idiomas,String ubicacion,int dias, float sueldo) {
        float sueldoTotal=0;
       if(profesion.equals("Ingeniero")){
                sueldoTotal = (sueldo + 2000000) * dias;
            }else if (profesion.equals("Tecnologo")){
                sueldoTotal = (sueldo + 1500000) * dias;
            }else if (profesion.equals("Tecnico")){
                sueldoTotal = (sueldo + 1000000) * dias;
            }else{
                sueldoTotal = (sueldo + 850000) * dias;
            }
            if(idiomas.length == 0){
            sueldoTotal = sueldoTotal;
            }
            else{
                //sueldoTotal = sueldo*dias;
                for(int i=0 ; i<idiomas.length ; i++){
                    if(idiomas[i].equals("ingles")){
                        sueldoTotal = sueldoTotal + 250000;
                    }
                    else if(idiomas[i].equals("frances")){
                        sueldoTotal = sueldoTotal + 330000;
                    }
                    else if(idiomas[i].equals("aleman")){
                        sueldoTotal = sueldoTotal + 500000;
                    }
                }
            }
            if (ubicacion.equals("Afueras")){
                sueldoTotal = sueldoTotal + 80000;
            }else {
                sueldoTotal = sueldoTotal;
            }
        return sueldoTotal;
    }
    
}


