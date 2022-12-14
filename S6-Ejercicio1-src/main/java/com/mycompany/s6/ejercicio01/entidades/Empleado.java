/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s6.ejercicio01.entidades;

import com.mycompany.s6.ejercicio01.util.Util;



/**
 *
 * @author Usuario
 */
public class Empleado {
    private String id;
    private String nombre;
    private String correo;
    private int area;
    private int categoria;
    private double sueldo;

    //costructores
    public Empleado(String id, String nombre, String correo, int area, int categoria, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.area = area;
        this.categoria = categoria;
        this.sueldo = sueldo;
    }

    public Empleado() {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

   public double getSueldo() {
         double sbase;
        switch (this.categoria) {
            case 0:
                sbase = Util.JUNIOR;
                break;
            case 1:
                sbase = Util.SENIOR;
                break;
            case 2:
                sbase = Util.PRACTICANTE;
                break;
            case 3:
                sbase = Util.GERENTE;
                break;
            case 4:
                sbase = Util.OPERARIO;
                break;    
            default:
                sbase = 0;
        }
        double sneto;
        switch (this.area) {
            case 0:
                sneto = sbase*(1 + Util.MARKETING);
                break;
            case 1:
                sneto = sbase+ sbase* Util.RRHH;
                break;
            case 2:
                sneto = sbase +sbase* Util.PLANTA;
                break;
            case 3:
                sneto = sbase +sbase* Util.VENTAS;
                break;
            case 4:
                sneto = sbase +sbase* Util.GERENCIA;
                break;
            default:
                sneto =0;
        }
        this.sueldo = sneto;
        
        return sueldo;
    }
   

     /*
    Se esta protegiendo de cambios indebidos
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    */
      
    // to string
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", area=" + area + ", categoria=" + categoria + ", sueldo=" + sueldo + '}';
    }


    
    
}
