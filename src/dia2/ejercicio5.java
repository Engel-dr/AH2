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
public class ejercicio5 {
     public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.println("ingresa tu radio");
     int radio = teclado.nextInt();
     int longitud = (int) (2*Math.PI*radio);
     int area = (int) (Math.PI * (radio*radio));
     System.out.println("la longitud es: "+longitud);
     System.out.println("el radio es : "+area);
     }
}
