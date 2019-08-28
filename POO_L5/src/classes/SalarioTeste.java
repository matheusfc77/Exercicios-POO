/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author roberta.beltran
 */
public class SalarioTeste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Salario s = new Salario();
        
        System.out.print("Valor ganho por hora: R$ ");
        s.setValHora(Double.parseDouble(in.nextLine()));
        System.out.print("Nº de horas trabalhado por mês: ");
        s.setNumHoras(Integer.parseInt(in.nextLine()));
        
        double[] slr = s.calcSlr();
        System.out.printf("Salário Bruto: R$ %.2f%n", slr[0]);
        System.out.printf("\t(-) IR: R$ %.2f%n", slr[2]);
        System.out.printf("\t(-) INSS: R$ %.2f%n", slr[3]);
        System.out.printf("\t(-) Sindicato: R$ %.2f%n", slr[4]);
        System.out.printf("Salário Líquido: R$ %.2f%n", slr[1]);
        in.close();
    }
}
