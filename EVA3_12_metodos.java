/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_12_metodos;

/**
 *
 * @author user
 */
public class EVA3_12_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Invocar al metodo-->llamada --> call
      mostrarMensaje("Hola mundo cruel!!!"); 
        mostrarMuchosMensajes("Hola!!", 5);
    }
    //public static--> para la materia de POO
    //  void--> (tipo de dato) valor que regresa el metodo
    // void --> no regresa nada
    // nombre del metodo --> identificador valido
    //                   empezar el minusculas, debe ser un verbo
    //() <-- parametros del metodo (argumento)--> valor que necesita para funcionar
    public static void mostrarMensaje(String mensaje){ //encabezado (nombre del metodo)
        //cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);   
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);   
        }
    }
}
