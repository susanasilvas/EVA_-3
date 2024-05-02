/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_foreach;

/**
 *
 * @author user
 */
public class EVA3_10_ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diasSemana[] = {"Domingo" ,"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"," Sabado"};
        for (String dia : diasSemana){
            System.out.println(dia);
        }   
            int salario[] = { 50, 1000, 12314, 25555,2566,475};
            for(int cant: salario)
           System.out.println("$" + cant);
            //------
            //MESES DEL AÑO.IMPRIMIR CON FOR-EACH
         String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
         for(String mes:meses)
             System.out.println(mes);
            
           

        
    }
    
}
