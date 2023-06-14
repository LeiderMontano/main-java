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
public class NumeroParOImpar {
    
    public static void main(String[] args) throws IOException {
        /**
         * Esta función sirve para recibir los números.
         */
        System.out.println("Ingresa un número y te diré si es Par o Impar.");
        
        System.out.println("Ingresa el número y luego presiona el boton Enter:");
        Integer num1 = cargarNumeros();
        
        /**
         * Sirve para imprimir el número.
         */
        calcularNumeroPar (num1);
        
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
    
    private static void calcularNumeroPar (Integer num1){
        /**
         * Esta función sirve para calcular si el número es Par o Impar.
         */
                       
        if (num1 % 2 == 0){
            System.out.println("!" + num1 + " es un número Par!");
        }else {
            System.out.println("!" + num1 + " es un número Impar!");
        }
        
    }
}