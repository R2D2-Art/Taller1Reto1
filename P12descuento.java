/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p12descuento;

import java.util.Scanner;
public class P12descuento {
 
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        //Pedimos el monto
        System.out.print("Ingrese el monto de la compra = ");
        double monto = Leer.nextInt();
        //hacemos los condicionales
        if (monto>100){
           double desdiez=0.1;
           double total=desdiez*monto;
           double montocondescuento=monto-total;
            
            System.out.print("Su descuento es con el 10% = " + montocondescuento);
            
        }else if(monto>50 && monto<=100){
           double desDos=0.02;
           double total2=desDos*monto;
           double montocondescuento2=monto-total2;
           
            System.out.print("Su descuento es con el 2% = " + montocondescuento2);

        }else {
            System.out.print("Sin descuento");
        }
        
        
        
    }
}
