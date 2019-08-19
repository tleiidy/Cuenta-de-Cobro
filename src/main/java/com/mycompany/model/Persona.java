/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author Gerard Amortegui
 * @author Brayan Diaz
 */

/**
* Clase creada con el fin de almacenar los datos mandados por el usuario desde la vista
*/
public class Persona {
    /**variable que almacena el nombre*/
    private String nombre;
    /**variable que almacenar el sueldo*/
    private float sueldo;
    /**variable que almacena el numero de dias trabajados por la persona*/
    private int dias;
    /**vector que almacena los idiomas utilizados por la persona*/
    private String[] idiomas;
    /**
     * Constructor de la clase persona que recibe los siguientes parametros
     * @param nombre
     * @param sueldo
     * @param dias
     * @param idiomas 
     */
    public Persona(String nombre, float sueldo, int dias, String[] idiomas) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dias = dias;
        this.idiomas = idiomas;
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
     * Metodo que calcula el sueldo total en base a los datos ingresados por las persona mediante los siguiente parametros 
     * @param sueldo
     * @param dias
     * @param idiomas
     * @return 
     */
    public float sueldoTotal(float sueldo, int dias, String[] idiomas){
    
        float resultado = 0;
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
}
