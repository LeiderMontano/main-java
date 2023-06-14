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
public class Funciones {
    public static void main(String[] args) throws IOException {
        /**
         * Esta función sirve para recibir los números.
         */
        System.out.println("Ingresa tres números.");
        
        System.out.println("Ingresa el primer numero y luego presiona el boton Enter:");
        Integer num1 = cargarNumeros();
        
        System.out.println("Ingresa el segundo numero y luego presiona el boton Enter:");
        Integer num2 = cargarNumeros();
        
        System.out.println("Ingresa el tercer numero y luego presiona el boton Enter:");
        Integer num3 = cargarNumeros();
        
        /**
         * Sirve para imprimir los números.
         */
        calcularNumeroMayor (num1, num2, num3);
        calcularNumeroMenor (num1, num2, num3);
     }
    
    private static Integer cargarNumeros() throws IOException{
        /**
         * Esta función sirve para perdir el ingreso de los números.
         */
        InputStreamReader CapturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(CapturarTeclado);
        
        String strNum  = buffer.readLine();
        
        Integer num = Integer.parseInt(strNum);
        
        return num;
    }
    
    private static void calcularNumeroMayor (Integer num1,Integer num2, Integer num3){
        /**
         * Esta función sirve para calcular el número mayor.
         */
        Integer numMayor = num1; 
        
        if (num2 > numMayor){
            numMayor = num2;
        }
        if (num3 > numMayor){
            numMayor = num3;
        }
        
        System.out.println("El número mayor es: " + numMayor);
    }
    
    private static void calcularNumeroMenor (Integer num1,Integer num2, Integer num3){
        /**
         * Esta Función sirve para calcualar el número menor.
         */
        Integer nunMenor = num1;
        
        if (num2 < nunMenor){
            nunMenor = num2;
        }
        if (num3 < nunMenor){
            nunMenor = num3;
        }
        
        System.out.println("El número menor es: " + nunMenor);
        
    }
}
