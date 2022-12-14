/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s6.ejercicio2.etidades;

/**
 *
 * @author Usuario
 */
public class Alumno {
    private String id;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;
    private int promedio;
    private String estado;

    public Alumno(String id, String nombre, int nota1, int nota2, int nota3, int promedio, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
        this.estado = estado;
    }

    public Alumno() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getPromedio() {
       int prom=0;
        prom=(this.nota1+this.nota2+this.nota3)/3;
         this.promedio = prom;
         
         return promedio;
    }

    
    public String getEstado() {
        String est="";
        if(this.promedio<13){
            est="Desaprobado";
        }else{
            est="Aprobado";
        }
        this.estado =est;
        
        return estado;
    }

   

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", promedio=" + promedio + ", estado=" + estado + '}';
    }

    
}
