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
public class ejercicio4 {
 public static void main(String[] args){
 Scanner teclado = new Scanner(System.in); 
 System.out.println("ingresa tu temperatura");
 int numero = 32+(9*(teclado.nextInt()/5));
 System.out.println("la temperatura en fahrenheit es: "+numero);
 }
    
}
