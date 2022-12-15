/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercico.sesion2;


public class actividadClase {

    public static void main(String args[]){
        
        String[] names = new String[3]; //apunta a null
        
        //String names[] = new String[3]; //crea 3 espacios de memoria vacios 
                                          //luego apunta anull
        
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";
        
        int[] numbers = {100, 200, 300};
        
        for (String name:names){
           System.out.println("Name: " + name); 
        }
        
        for (int number:numbers){
           System.out.println("Number: " + number); 
        }           
    }
}
