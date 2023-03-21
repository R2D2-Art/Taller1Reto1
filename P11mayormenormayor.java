/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p11mayormenormayor;


//importa la clase de Scanner
import java.util.Scanner;
//declaramos la clase
public class P11mayormenormayor {
    public static void main(String[] args) {
        //Creamos el objeto de scanner
        Scanner Leer=new Scanner(System.in);  
        //Declaramos la varaible
        int N1; 
        int N2; 
        int N3; 
        int P; 
        int S;
        int T;
       
        //pedimos los numeros
        System.out.print("Ingrese Numero 01 : ");   
        N1 = Leer.nextInt(); 
        
        System.out.print("Ingrese Numero 02 : ");
        N2 = Leer.nextInt(); 
        
        System.out.print("Ingrese Numero 03 : ");
        N3 = Leer.nextInt(); 
        
        //se crea condicionales para de ascendente y decendente
        if((N1 > N2) && (N1 > N3)){
            P = N1;            
            if(N2 > N3){
                S = N2;
                T = N3;
            }else{
                S = N3;
                T = N2;
            }             
        }else{
            if(N2 > N3){
                P = N2;
                if(N1 > N3){
                    S = N1;
                    T = N3;                
                }else{
                    S = N3;
                    T = N1;
                }                 
            }else{
                P = N3;
                if(N1 > N2){
                    S = N1;
                    T = N2;                
                }else{
                    S = N2;
                    T = N1;
                } 
            } 
        }          
        System.out.println("\nDecendente : " + P + "," + S + "," + T);
        System.out.println("Ascendente : " + T + "," + S + "," + P); 
    }   
}
