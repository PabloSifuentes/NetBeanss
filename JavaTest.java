/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatest;

import java.util.Scanner;

/**
 *
 * @author pablo_sifuentes
 */
public class JavaTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" Insira um valor: ");
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        int antecessor = x-1;
        int sucessor = x+1;
        System.out.println(" Qual foi seu antecessor:" + antecessor + " Qual foi seu sucessor: "+ sucessor);
        
        
             
                
                
        
    }
    
}
