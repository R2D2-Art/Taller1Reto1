/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p10triangulo;

//importamos jclase Scanner
import java.util.Scanner;
//Declaramos la clase
public class P10triangulo {

    public static void main(String[] args) {
        //Declaramos variables
        double ladoA;
        double ladoB;
        double ladoC;
        //creamos objeto de la clase Scanner
        Scanner Leer =new Scanner(System.in);
        //pedimos las longitudes
        System.out.print("Ingrese lado A = ");
        ladoA=Leer.nextDouble();
        
        System.out.print("Ingrese lado B = ");
        ladoB=Leer.nextDouble();
        
        System.out.print("Ingrese lado C = ");
        ladoC=Leer.nextDouble();       
        
        //hacemos las condiones
        if (ladoA<(ladoB+ladoC)){
          System.out.print("es un triangulo ");            
            
        }else if (ladoB<(ladoA+ladoC)){
          System.out.print("es un triangulo ");            
            
        }else if(ladoC<(ladoA+ladoB)){
        System.out.print("es un triangulo ");  
            
        }if(ladoA==ladoB && ladoB==ladoC && ladoA==ladoC){
        System.out.print("equilatero ");              
        }else {
            
         System.out.print(" isoceles ");  
            
        }
        
        
    }
}
