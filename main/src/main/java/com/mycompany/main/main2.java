/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author leide
 */
public class main2 {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        System.out.println("Ingresa tu edad:");
        String strEdad  = buffer.readLine();
        Integer edad = Integer.parseInt(strEdad);
        
        System.out.println("Tu edad es: " + strEdad + " años");
        
        if (edad >= 18) {
            System.out.println ("Es mayor de edad");
            }else{
            System.out.println("Es menor de edad");
       }
        
    }
}
