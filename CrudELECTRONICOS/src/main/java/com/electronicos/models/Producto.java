/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.electronicos.models;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int id;
    private String nombre;
    private int idmarca;
    private int cantidad;
    private String descripcion;
    private int precio;
    private int idProveedor;
    private int idCategoria;

    public Producto(String nombre, int idmarca, int cantidad, String descripcion, int precio, int idProveedor, int idCategoria) {
        this.nombre = nombre;
        this.idmarca = idmarca;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precio = precio;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    public Producto(){

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

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
}
