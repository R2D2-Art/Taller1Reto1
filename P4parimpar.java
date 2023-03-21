/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p4parimpar;


//importamos clase Scanner
import java.util.Scanner;
//Declaramos clase
public class P4parimpar {

    public static void main(String[] args) {
        //Declaramos variables
        int N;
        int resto;
        int resultado;
        int division;
        //Creamos objeto parra la clase Scanner
        Scanner Leer= new Scanner(System.in);
        //pedimos el numero a identificar
        System.out.print("Ingrese el numero = ");
        N=Leer.nextInt();
        //Hacemos la operacion para saber si es divisible en 2 
        division=N/2;
        resto=division*2;
        resultado=N-resto;
        
        //condicional para decir si es par o impar
        if(resultado==0){
            System.out.print("Es par");
        }else{
            System.out.print("Es impar");
        }
        
    }
}
