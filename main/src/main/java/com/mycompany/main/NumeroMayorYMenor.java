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
public class NumeroMayorYMenor {
    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        
        System.out.println("Ingresa tres números.");
        
        System.out.println("Ingresa el primer numero:");
        String strNum1  = buffer.readLine();
                System.out.println("Ingresa el segundo numero:");
        String strNum2  = buffer.readLine();
        
        System.out.println("Ingresa el tercer numero:");
        String strNum3  = buffer.readLine();
        
        Integer num1 = Integer.parseInt(strNum1);
        Integer num2 = Integer.parseInt(strNum2);
        Integer num3 = Integer.parseInt(strNum3);
        
        Integer numMayor = num1; 
        Integer nunMenor = num1;
        
        if (num2 > numMayor){
            numMayor = num2;
        }
        if (num3 > numMayor){
            numMayor = num3;
        }
        
        System.out.println("El número mayor es: " + numMayor);
        
        if (num2 < nunMenor){
            nunMenor = num2;
        }
        if (num3 < nunMenor){
            nunMenor = num3;
        }
        
        System.out.println("El número menor es: " + nunMenor);
        
     }
}
