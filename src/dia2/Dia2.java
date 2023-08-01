/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;
import java.util.Scanner;
/**
 *
 * @author CesarLopez
 */
public class Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sp = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = sp.nextLine();
        
        System.out.println("Buenos dias "+nombre);
        
    }
    
}
