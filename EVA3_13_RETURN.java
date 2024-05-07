/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor 1");
        int val1 = captu.nextInt();
        System.out.println("Valor 2");
        int val2 = captu.nextInt();
        // llamar funcion 
        // 1. guardar el resultado
        // int resu = sumar(val1, val2);
        //System.out.println(la suma =        
 System.out.println("la suma = " + sumar(val1, val2));
  
        System.out.println("la suma =" + sumar(val1, val2)); 
        sumar(val1,val2);
    
    }
    
    
    public static int  sumar(int num1, int num2){
        int resu = num1 + num2;
        return resu; // es la ultima instrucion del metodo despues del return no puede haber mas instrucciones.
        
    }
    
}
