/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s7.ejercicio2.entidades;

/**
 *
 * @author Usuario
 */
public class Alumnos {
   private int id;
   private String nombre;
   private String Correo;
   private int promedio;
   private String estado;
   private String sexo;

    public Alumnos(int id, String nombre, String Correo, int promedio, String sexo) {
        this.id = id;
        this.nombre = nombre;
        this.Correo = Correo;
        this.promedio = promedio;
        this.sexo = sexo;
    }

    public Alumnos() {
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

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        String Est="";
        if(this.promedio<13){
            Est="Desaprovado";
                    
        } else{
        Est="Aprobado";
        }
        this.estado=Est;
        return estado;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "id=" + id + ", nombre=" + nombre + ", Correo=" + Correo + ", promedio=" + promedio + ", estado=" + estado + ", sexo=" + sexo + '}';
    }
    
}
