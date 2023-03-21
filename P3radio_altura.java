/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p3radio_altura;

/**
 *
 * @author Arturo
 */
import java.util.Scanner;
public class P3radio_altura {

    public static void main(String[] args) {
        //Declaramos variables
        double radio;
        double  altura;
        double pi=3.1416;
        //creamos el objeto para Dcanner
        Scanner Leer =new Scanner(System.in);

        //Pedimos que ingresen los valores de radio y altura
      System.out.print("Ingrese El radio = ");
      radio=Leer.nextDouble();
      
     System.out.print("Ingrese la altura del cilindro = ");
     altura=Leer.nextDouble();
     
     //llamamos funciones
      CalcularVolumen(radio,altura,pi);
      CalcularArea(radio, altura,pi);
        
    }
    //creamos metodo
    public static void CalcularVolumen(double radio,double altura, double pi){
        
        double volumen ;
        //hacemos la formula para volumen
        volumen=pi*(radio*radio)*altura;
        //imprimimos el resultado
        System.out.println("El volumen del cilindro es = " + volumen);

    }
    //creamos metodo para calcular area
    public static void CalcularArea (double radio, double altura, double pi){
        double Area;
        //hacemos la formula para el area
        Area=2*pi*radio*(radio+altura);
        //imprimimos el resultado
        System.out.print("El area del cilindro es = " + Area);
        
    } 

}
