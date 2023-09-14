
package pkgif.Exercicio.ifelse;

import java.util.Scanner;


public class IfElse4 {
    
    public static void main(String[] args) { 
        
        Scanner n = new Scanner(System.in);
        System.out.println(" Informe o valor da hora: ");
        System.out.println(" Informe a quantidade de horas trabalhadas: ");
        float valorhora = n.nextInt();
        int horas = n.nextInt();
        float salario = 0;
        float valorExcendente = 0;
       
        
        if (horas > 40) {
            salario = 40 * valorhora;
            valorExcendente = (horas - 40) * (valorhora + (valorhora * 0.5f));
        }
            else {
                   salario = valorhora * horas;
                    }
              System.out.printf("o salario é de: R$ %.2f \nsalario: R$ %.2f " + "\nvalor excedente R$ %.2f\n", (salario + valorExcendente), salario, valorExcendente);
        }
}
        
    
    

/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de  50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que  deverá ser acrescido das horas extras,
caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/