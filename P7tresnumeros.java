/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p7tresnumeros;

/**
 *
 * @author Arturo
 */
//Importamos la clase Scanner
import java.util.Scanner;
//Declaramos la clase
public class P7tresnumeros {

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
        if(A<B&&B<C){
            System.out.print("El primer menor de los tres ");
        }else if(B<A&&A<C){
            System.out.print("El segundo es el menor de los tres ");
            
        }else if(C<A&&A<B){
            System.out.print("El tercer es el menor de los tres ");
            
        }
    }
}
