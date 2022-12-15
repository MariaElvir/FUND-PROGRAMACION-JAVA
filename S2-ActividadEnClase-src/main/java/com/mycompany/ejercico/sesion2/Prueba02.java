/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercico.sesion2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba02 {
    //TODO Hacer un programa que muestre si un numero entero ingresado 
    //es positivo, negativo o CERO.
    
     public static void main(String[] args) {
        System.out.println("ingresa un numero entero");
         Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();//captura un numero entero y lo asigna a n
        
        if(n<0)
             System.out.println("es negativo");
        else if (n>0)
             System.out.println("es positivo");
        else
             System.out.println("es CERO");
    }
    
}