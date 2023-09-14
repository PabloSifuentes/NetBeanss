
package pkgif.Exercicio.ifelse;

import java.util.Scanner;
import javax.swing.JOptionPane;


class Interger {
    
    public static void main(String[] args) {
        
        double media = 0;
        double somanotas = 0;
        
        for (int i = 0; i < 3; i++) {
            
            double nota = Double.parseDouble(JOptionPane.showInputDialog(" Informe a nota "+(i+1)));
            somanotas += nota; //somasnotas = somasnotas + nota;
              
            
        }
        
        
        
        
    }
    
}
/*  Crie um programa que peça para informar 3 notas e calcule a média.
Ao final mostre se o aluno está Reprovado, em Exame ou Aprovado. (3 > Reprovado) (3 < Exame < 6) (7 < Aprovado)*/