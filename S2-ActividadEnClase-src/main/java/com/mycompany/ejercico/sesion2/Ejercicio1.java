/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercico.sesion2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 Ejercicios:
    Ejercicio 01:
        Desarrollar una aplicacion que ingreso los datos de 5 alumnos(id, nombre, pc1,pc2,pc3)
        Mostrar el promedio de la practicas de cada alumno
        Mostrar el promedio mayor de los alumnos
        Mostrar el promedio de promedios.
[contadores, acumuladores y bucles]
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner alumnos = new Scanner(System.in);
        int i,j, alumno;
        double calificacion1, calificacion2,calificacion3, promedio;
        List<Double> promedios = new ArrayList<Double>();
        promedio = 0;
        System.out.print("Ingresa el valor de alumnos: ");
         alumno= alumnos.nextInt();
        alumnos.nextLine();
        for (i=1; i<=alumno; i++) {
            System.out.print("Alumno " + i);
            System.out.print("Ingresa la nota 1: ");
            calificacion1 = alumnos.nextDouble();
            System.out.print("Ingresa la nota 2: ");
            calificacion2 = alumnos.nextDouble();
            System.out.print("Ingresa la nota 3: ");
            calificacion3 = alumnos.nextDouble();
                    
            alumnos.nextLine();
            
            promedio=(calificacion3+calificacion2+calificacion1)/3;
            promedios.add(promedio);
        }
        //Promedio Mayor
        double numeromayor= 0;
        int nAlumnoMayor=0;
        for(j=0; j<promedios.size(); j++){
            if(promedios.get(j)>numeromayor){ // 
               numeromayor = Math.round(promedios.get(j));
               nAlumnoMayor=j+1;
           }
        }
        //Promedio Menor
        double numeromenor= 21;
        int nAlumnoMerno=0;
        for(int k=0; k<promedios.size(); k++){
            if(promedios.get(k)<numeromenor){ // 
               numeromenor = Math.round(promedios.get(k));
              nAlumnoMerno=k+1;
           }
        }
        
        
        System.out.println("Promedio menor del Alumno"+nAlumnoMerno+" es igual "+numeromenor);
        System.out.println("Promedio mayor del Alumno"+nAlumnoMayor+" es igual "+ numeromayor);
        System.out.println("Valor de promedio: " + promedios);
    }
    

}

