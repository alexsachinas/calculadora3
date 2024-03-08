/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany. calculator3;

import javax.swing.JOptionPane;

public class Calculator3 {
   
    public static void main(String[] args) {
        int n1=Integer.parseInt(Joptionpane.showInputlog("digita el numero 1"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("digita el numero 2"));
        
        
        
         Operaciones op = new  Operaciones();
         int suma=op.sumar(n1, n2);
         int resta=op.restar(n1, n2);
         int multiplicacion=op.multiplicacion(n1, n2);
         int division=op.division(n1, n2);
         int porcentaje=op.porcentaje(n1, n2);
         op.mostrarResultados(suma, resta, multiplicacion, division,porcentaje);
         
    }
    
}
