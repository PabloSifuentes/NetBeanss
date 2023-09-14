
package pkgif.Exercicio.ifelse;

import java.util.Scanner;


public class IfElse {

    
    public static void main(String[] args) {
        
        System.out.println(" Insira sua idade: ");
        Scanner pessoa = new Scanner(System.in);
        
        int idade = pessoa.nextInt();
        
        if (idade < 18)
            System.out.println(" Menor de idade! ");
        
        else if (idade >= 18 && idade < 65)
            System.out.println(" Maior de idade ");
        
        else
            System.out.println(" idoso ");
        
            
        
        
        
        
        
        
        
        
       
    }
    
}
