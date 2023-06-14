/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author leide
 */
public class NumeroParOImpar {
    
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
         * Sirve para imprimir el número.
         */
        calcularNumeroPromedio (num1, num2, num3);
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
    
    private static void calcularNumeroPromedio (Integer num1,Integer num2, Integer num3){
        /**
         * Esta función sirve para calcular el número promedio.
         */
        
        double suma = num1 + num2 + num3;
        double numPromedio = suma/3;
        
        DecimalFormat formatoSensillo = new DecimalFormat("#.00");
        
        System.out.println("La suma de los tres numeros es: " + formatoSensillo.format(suma));
        
        System.out.println("El número promedio es: " + formatoSensillo.format(numPromedio));
    }
    
}
