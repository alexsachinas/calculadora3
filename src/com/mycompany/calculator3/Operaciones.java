/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator3;


class Operaciones {
    
   //atributos
    
    //metodos
    
    //metodo de suma
    
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
       
    }
   
    //metodo resta
    
    public int restar(int numero1, int numero2){
        int restar=numero1 - numero2;
        return restar;
       
    }
    
    // metodo multiplicacion 
    
    public int multiplicacion(int numero1, int numero2){
        int multiplicacion= numero1 * numero2;
        return multiplicacion;
    }
    
    // metodo resta 
    
    public int division(int numero1,int numero2){
        int division=numero1/numero2;
        return division;
    }
    
    //metodo porcentaje
    
    public int porcentaje(int numero1, int numero2){
        int porcentaje= (numero1/ numero2)*100;
        return porcentaje;
    }
    
    //muestra resultados 
    
    public void mostrarResultados(int suma, int resta, int multiplicacion, int division , int porcentaje){
        
        System.out.print("la suma es: " + suma);
        
        System.out.print("la resta es: " + resta);
        
        System.out.print("la multiplicacion es: " + multiplicacion);
        
        System.out.print("la division es: " + division);
        
        System.out.print("el porcentaje es: " + porcentaje );
       
    }
}
