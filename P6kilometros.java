/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p6kilometros;

/**
 *
 * @author Arturo
 */
//importamos la clase Scanner
import java.util.Scanner;
//Declaramos la clase
public class P6kilometros {

    public static void main(String[] args) {
        //declaramos variables
        double kh;
        double metros=1000;
        int segundos=3600;
         
        //Creamos el objeto para la clase Scanner 
        Scanner Leer =new Scanner (System.in);
        
        //Pedimos los k/h
        System.out.print("Ingrese la velocidad en k/h del automovil = ");
        kh=Leer.nextDouble();
        CalcularMS(kh, metros, segundos);
        
        
    }
    //Metodo para pasar los k/h a m/s
    public static void CalcularMS(double kh, double metros, int segundos){
        double ms;
        double R1;
        //Hacemos la operacion
        R1=kh*metros;
        ms=R1/segundos;
        //imprimimos la conversion
        System.out.print("En metros sobre segundos es = " + ms+"m/s");
    }
}
