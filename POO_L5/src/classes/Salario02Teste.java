/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class Salario02Teste {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Salario02 s = new Salario02();
        
        System.out.print("Valor ganho por hora: R$ ");
        s.setValHora(Double.parseDouble(in.nextLine()));
        System.out.print("Nº de horas trabalhado por mês: ");
        s.setNumHoras(Integer.parseInt(in.nextLine()));
        
        System.out.printf("Salário Bruto: R$ %.2f%n", s.slrBruto());
        System.out.printf("\t(-) IR: R$ %.2f%n", s.impRenda(s.slrBruto()));
        System.out.printf("\t(-) INSS: R$ %.2f%n", s.inss(s.slrBruto()));
        System.out.printf("\t(-) Sindicato: R$ %.2f%n", s.sindicato(s.slrBruto()));
        System.out.printf("Salário Líquido: R$ %.2f%n", s.slrLiq());
        in.close();
    }
}
