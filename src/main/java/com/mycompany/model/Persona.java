/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author tegui
 */
public class Persona {
    private String nombre;
    private float sueldo;
    private int dias;
    private String[] idiomas;

    public Persona(String nombre, float sueldo, int dias, String[] idiomas) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.dias = dias;
        this.idiomas = idiomas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }
    
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
