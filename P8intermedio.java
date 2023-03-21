/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p8intermedio;


//Importamos la clase Scanner
import java.util.Scanner;
public class P8intermedio {

    public static void main(String[] args) {
               //Declaramos variables
        int A;
        int B;
        int C;
        //Creamos objeto para Scanner
        Scanner Leer =new Scanner(System.in);
        
        //Pedimos los numeros
        System.out.print("ingrese el primer numero = ");
        A=Leer.nextInt();
        
        System.out.print("ingrese el segundo numero = ");
        B=Leer.nextInt();
        
        System.out.print("ingrese el tercer numero = ");
        C=Leer.nextInt();
        
        //Creamos condicionales para saber cual de tres es el numero menor
        if(A<B&&A>C){
            System.out.print("El primer numero es el intermedio ");
        }else if(B<A && B>C){
            System.out.print("El segundo es el numero intermedio ");
            
        }else if(C>B&&C<A){
            System.out.print("El tercer es el numero intermedio ");
            
        }
    }
}
