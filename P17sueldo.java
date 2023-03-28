/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p17sueldo;
 
import java.util.Scanner;

public class P17sueldo {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        //Pedimos que ingrese el sueldo
        System.out.print("Ingrese su sueldo = ");
        double sueldo = Leer.nextInt();
        //hacemos los condicionales
        if (sueldo<=1000){
            //hacemos la operacion para que se descuente
           double desdiez=0.1;
           double total=desdiez*sueldo;
           double sueldodescuento=sueldo-total;
            
            System.out.print("se descuentan de su sueldo el 10% =" + sueldodescuento);
            
        }else if(sueldo>1000 && sueldo<=2000){
           double desDos=0.05;
           double total2=desDos*sueldo;
           double sueldodescuento2=sueldo-total2;
           
            System.out.print("se descuentan de su sueldo el 5% = " + sueldodescuento2);

        }else if(sueldo>2000){
            double desDos=0.03;
           double total2=desDos*sueldo;
           double sueldodescuento3=sueldo-total2;
           
           System.out.println("Sueldo neto = " + sueldo);
            System.out.print("se descuentan de su sueldo el 3% = " + sueldodescuento3);
            
        }
        
        
    }
}


