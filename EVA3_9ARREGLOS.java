
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9arreglos;

/**
 *
 * @author user
 */
public class EVA3_9ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String diasSemanas[] = {"Domingo" ,"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"," Sabado"};
     char vocales[] = {'a','e','i','o','u'};
        System.out.println("Tamaño del arreglo diasSemanas = " + diasSemanas.length);
        System.out.println("Tamaño del arreglo vocales = " + vocales.length);
        
        for (int i = 0; i < diasSemanas.length; i++) {
            System.out.println(diasSemanas[i]);
            
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i]);
            
        }
        {
            String mensaje = "Hola";
            System.out.println(mensaje);
        }
        System.out.println("");
        String menu[] = {"Archivo","Nueva Factyra", "Modificar","Salida"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + "-" + menu[i]);
            
        }
        
    }
    }
    
} 
    
