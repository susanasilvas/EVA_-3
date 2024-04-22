/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_arreglos;

/**
 *
 * @author user
 */
public class EVA3_1_ARREGLOS {

    public static void main(String[] args) {
       //LOS ARREGLOS EN JAVA SON OBJETOS
       //TENEMOS QUE CREARLOS ANTES DE USARLOS
       //[] -- MANEHAR LOS +INDICES: ARREGLO [3] ACCESO A LA POSICION
       //DECLARACION = CREACION (new)[tamaño del arreglo]
       int arreglo[] = new int[10];// un arreglo de 10 enteros
       // a traves de índices:
       // conocer las posiciones de los valores:
       //PRIMERA POSICIÓN DE UN ARREGLO ES CERO -- 0
       // ULTIMA POSICIÓN DE UN ARREGLO ES -- N - 1, donde
       //N ES EL TAMAÑO DEL ARREGLO
       arreglo[1] = 100;
       System.out.println("Valor de arreglo[1] = " + arreglo[1]);
       System.out.println(arreglo);
       System.out.println(arreglo.length);// length es la cantidad de elementos 
    }
}
