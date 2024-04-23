/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_2_arreglos_2;

/**
 *
 * @author user
 */
public class EVA_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JAVA: 0 primer elemento
        //      n -1 ultimo elemento
        // N -- TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        // vamos a crear un arreglo y llenarlo de valores aleatorios
        // int datos[],
        // int[] datos, x, y;--> todas las variables son arreglos
        int datos[] = new int[10];
        
        // asignar valores aleatorios entre 0 y 99, (1 y 100)
        for (int i = 0; i < datos.length; i++) {
          datos[1] = (int) (Math.random() * 100); // 0-99
        }
        // imprimir los elementos del arreglo:
        for (int i = 0; i < datos.length; i++) {
           System.out.print("[" + datos[i] + "]");
        }
    }
    
}
