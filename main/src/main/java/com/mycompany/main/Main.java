/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author leide
 */
public class Main {

    public static void main(String[] args){
        
        Integer personas = 2;
        
        Integer chismosos = 3;
        
        String nombre = "Luna";
        
        String frase = "Hoy brilla la " + nombre;
        
        System.out.println(frase + ", hay " + (personas + chismosos) + " personas viendo la " + nombre + ".");
       
        Integer edad = 18;
       
        Boolean esMayorDeEdad = edad >= 18;
                
        if (esMayorDeEdad) {
            System.out.println ("Es mayor de edad");
            }else{
            System.out.println("Es menor de edad");
       }

    }
}
