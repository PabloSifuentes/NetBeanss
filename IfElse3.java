package pkgif.Exercicio.ifelse;

import javax.swing.JOptionPane;


public class IfElse3 {

    

    public static void main(String[] args) {
        
        int maior = Integer.MAX_VALUE;
        int menor = Integer.MIN_VALUE;
        
        System.out.println("Maior número:"+maior+"\nMenor número:"+menor);
        
        for (int i = 0; i < 5; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero: "));
                    
                  if (numero > maior) {
                      maior = numero;
                  }
                  if (numero < menor){
                      menor = numero;
                  }
            System.out.println("o maior: "+maior+"\no menor: "+menor);
        }
                    
                    
  }
}


    

//Faça um programa que receba 10 valores e depois informe qual o menor e o maior valor digitado, utilize "if e else".
