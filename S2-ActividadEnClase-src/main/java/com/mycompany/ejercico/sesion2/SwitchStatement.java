/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercico.sesion2;

/**
 *
 * @author Usuario
 */
public class SwitchStatement {

    public static void main(String args[]){
        
        int color = 3;
        String shirt = " Shirt";
        
        switch (color){
            case 1:
                shirt = "Blue" + shirt;
                break;
            case 2:
                shirt = "Red" + shirt;
                break;
            case 3: 
                shirt = "Tan" + shirt;
                break;
            default:
                shirt = "White" + shirt;
        }
        
        System.out.println("Shirt type: " + shirt);
    }
}
