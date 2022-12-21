/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.certus.ejemplo.entidades;

/**
 *
 * @author AROM
 */
public class Clientes {
    
  private String nombre;
    private int telefono;
    private int ruc;
    private String correo;

    public Clientes() {
    }

    public Clientes(String nombre, int telefono, int ruc, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ruc = ruc;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int tlefono) {
        this.telefono = tlefono;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
  
    
    
}
