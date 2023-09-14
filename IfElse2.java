
package pkgif.Exercicio.ifelse;

import javax.swing.JOptionPane;


public class IfElse2 {
    
    public static void main(String[] args) {
        
        float peso = Float.parseFloat(JOptionPane.showInputDialog(" Imforme o peso: "));
       float altura = Float.parseFloat(JOptionPane.showInputDialog(" Informe a altura: "));
       
       float IMC = peso / (altura*2);
       
       if (IMC > 16.9) {
           JOptionPane.showInternalMessageDialog(null, " Muito abaixo do peso");
       }
           else if (IMC <= 17 && IMC <=18.4) {
                   JOptionPane.showInternalMessageDialog(null," Abaixo do peso ");
                   }
           else if (IMC >=18.5 && IMC <= 24.9) {
               JOptionPane.showInternalMessageDialog(null, " Peso normal ");
       }
           else if (IMC >=25 && IMC <= 29.9) {
               JOptionPane.showMessageDialog(null," Asima do peso ");
           }
           else if (IMC >=30 && IMC <= 34) {
               JOptionPane.showMessageDialog(null," Obesidade grau I ");
           }
           else if (IMC >=35 && IMC <= 40) {
               JOptionPane.showMessageDialog(null," Obesidade grau II ");
           }
           else {
               JOptionPane.showMessageDialog(null," Obesidade mórbida ");
           }
        
    }
    
}
