/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p16descuento2;

import java.util.Scanner;

 
public class P16descuento2 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        //Pedimos el monto
        System.out.print("Ingrese el monto de la compra = ");
        double monto = Leer.nextInt();
        //hacemos los condicionales
        if (monto>=300){
           double desdiez=0.25;
           double total=desdiez*monto;
           double montocondescuento=monto-total;
            
            System.out.print("Su descuento es con el 25% = " + montocondescuento);
            
        }else if(monto>150 && monto<300){
           double desDos=0.20;
           double total2=desDos*monto;
           double montocondescuento2=monto-total2;
           
            System.out.print("Su descuento es con el 20% = " + montocondescuento2);

        }else {
            System.out.print("Sin descuento");
        }
        
        
    }
}
