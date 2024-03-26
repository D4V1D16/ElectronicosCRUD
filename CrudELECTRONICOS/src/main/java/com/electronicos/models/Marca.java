/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electronicos.models;

/**
 *
 * @author Usuario
 */
public class Marca {
    
    private int id;
    private String nombre;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
}
