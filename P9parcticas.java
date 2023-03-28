/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p9parcticas;

import java.util.Scanner;
public class P9parcticas {

    public static void main(String[] args) {
        
    Scanner Leer =new Scanner (System.in);
    //
   double pc1, pc2, pc3, pc4, pcmenor, promedio;
    // Entrada de datos
    System.out.print("Ingrese nota 1 = ");
    pc1=Leer.nextDouble();
    System.out.print("Ingrese nota 2 = ");
    pc2=Leer.nextDouble();
    System.out.print("Ingrese nota 3 = ");
    pc3=Leer.nextDouble();
    System.out.print("Ingrese nota 4 = ");
    pc4=Leer.nextDouble();
     
       pcmenor = pc1;
    if( pc2 < pcmenor ){
        pcmenor = pc2;
    }else if( pc3 < pcmenor ){
        pcmenor = pc3;
    }else if( pc4 < pcmenor ){
        pcmenor = pc4;
    }
    // Determina el promedio
     promedio = (pc1 + pc2 + pc3 + pc4 - pcmenor )/3;
    // Salida de resultados
    System.out.println("El promedio es  = " + promedio);
    
    System.out.println("Nota menor = " + pcmenor);
    

    }
}
