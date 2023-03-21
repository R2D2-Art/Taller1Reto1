/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p5menoramayor;
//importamos clase Scanner
import java.util.Scanner;
//Declaramos clase
public class P5menoramayor {

    public static void main(String[] args) {
        //Declaramos varibles
        int N1;
        int N2;
        //Creamos objeto para la clase Scanner
        Scanner Leer= new Scanner(System.in);
        
        //pedimos los numeros
        System.out.print("Ingrese el primer numero = ");
        N1=Leer.nextInt();
        
        System.out.print("Ingrese el segundo numero = ");
        N2=Leer.nextInt();
        
         System.out.println("orden de menor a mayor");
         
         //Hacemos los condicionales para que asigne el mensaje necesario
        if(N1<N2){
            System.out.println(N1);
             System.out.println(N2);
            
        }else{
               System.out.println(N2);
               System.out.println(N1);
        }
            
            
        
    }
}
