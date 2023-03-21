/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1tresvalores;
//importamos clase Scanner
import java.util.Scanner;
public class P1tresvalores {
 
    public static void main(String[] args) {
        //Declaramos variables
        int A;
        int B;
        int C;
        //Creamos objeto para la clase Scanner
        Scanner Leer = new Scanner(System.in); 
     
        //imprmimos y pedimos los valor para las variables
        System.out.print("Ingrese el valor de A = ");
        A=Leer.nextInt();
        
        System.out.print("Ingrese el valor de B = ");
        B=Leer.nextInt();
        
        System.out.print("Ingrese el valor de c = ");
        C=Leer.nextInt();
        
        //creamos condicionales con if y else dependiendo de cual sea mayor y menor se le agisnara el mensaje
        if(A>B && B>C){
            System.out.println("El valor A es el mayor " );
            System.out.println("El valor C es el menor " + C);
            
        }else if(B>A && A>C){
            System.out.println("El valor B es el mayor");
            System.out.println("El valor C es el menor");
            
        }else if(A>C && C>B){
            System.out.println("El valor A es el mayor");
            System.out.println("El valor B es el menor");            
        }else if(C>A && A>B){
            System.out.println("El valor C es el mayor");
            System.out.println("El valor B es el menor");    
        }else if(C>B && B>A){
            System.out.println("El valor C es el mayor");
            System.out.println("El valor A es el menor");                
        }else if(B>C &&C>A){
            System.out.println("El valor B es el mayor");
            System.out.println("El valor A es el menor");                
        } 
        
        
    }
}
