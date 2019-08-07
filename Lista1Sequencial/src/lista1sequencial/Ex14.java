/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1sequencial;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o valor recebido por hora: ");
        double v = Double.parseDouble(in.nextLine());
        System.out.printf("Informe o nº de horas trabalhadas por mês: ");
        int h = in.nextInt();
        
        System.out.printf("Salário bruto: R$ %.2f%n", v*h);
        System.out.println("Descontos:");
        System.out.printf("\tIR: R$ %.2f%n", v*h*0.11);
        System.out.printf("\tINSS: R$ %.2f%n", v*h*0.08);
        System.out.printf("\tSindicatos: R$ %.2f%n", v*h*0.05);
        System.out.printf("Salário Líquido: R$ %.2f%n", v*h*(1-0.11-0.08-0.05));
    }
}
