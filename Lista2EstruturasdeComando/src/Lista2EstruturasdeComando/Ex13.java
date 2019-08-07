/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2EstruturasdeComando;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ir = 0;
        
        System.out.print("Informe o valor recebido por hora: ");
        double val = Double.parseDouble(in.nextLine());
        System.out.printf("Informe a quantidade de horas trabalhadas no mês: ");
        double h = Double.parseDouble(in.nextLine());
        
        if (val*h > 900 && val*h <= 1500)
            ir = 0.05;
        else if (val*h <= 2500)
            ir = 0.1;
        else if (val*h > 2500)
            ir = 0.2;
        
        System.out.printf("%nSalário Bruto (%.1f * %.2f): R$ %.2f%n", h, val, h*val);
        System.out.print("(-) IR (5%): ");
        System.out.printf("R$ %.2f%n", ir*val*h);
        System.out.print("(-) INSS (10%): ");
        System.out.printf("R$ %.2f%n", 0.1*val*h);
        System.out.print("FGTS (11%): ");
        System.out.printf("R$ %.2f%n", 0.11*val*h);
        System.out.printf("Total de descontos: R$ %.2f%n", (ir+0.1)*val*h);
        System.out.printf("Salário líquido: R$ %.2f%n", (1-ir-0.1)*val*h);
    }
}
