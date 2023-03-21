/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2sumatoria;

/**
 *
 * @author Arturo
 */
//declaramos la clase
public class P2sumatoria {

    public static void main(String[] args) {
        //declaramos la variable sumar
        int suma=0;
        //creamos un ciclo que comienza en i=1 hasta i<=10 en uno en uno
        for(int i=1; i<=10;i++){
            // se hace la suma de los valores del uno al 10
            suma=suma+i;
        }
        //se imprime el resultado
        System.out.print("Suma de l al 10 = "+ suma);
    }
}
