/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatest3;

import java.util.Scanner;

/**
 *
 * @author pablo_sifuentes
 */
public class JavaTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(" Informe as 3 notas da média:");
        Scanner notas = new Scanner(System.in);
        int nota1 = notas.nextInt();
        int nota2 = notas.nextInt();
        int nota3 = notas.nextInt();
        int resulmedia = (nota1+nota2+nota3)/3;
        System.out.println(" Qual foi a média: " +resulmedia);
                
                
        
                
        
        
    }
    
}
