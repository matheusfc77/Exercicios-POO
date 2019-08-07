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
public class Ex12 {
    public static void main(String[] args) {
        double aum;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o salário: ");
        double sal = Double.parseDouble(in.nextLine());
        
        if (sal <= 280) 
            aum = 0.2;
        else if (sal <= 700)
            aum = 0.15;
        else if (sal <= 1500)
            aum = 0.1;
        else
            aum = 0.05;
        
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", sal);
        System.out.printf("Percentual de aumento: %.2f%n", aum*100);
        System.out.printf("Valor do aumento: R$ %.2f%n", sal*aum);
        System.out.printf("Novo salário: R$ %.2f%n", (1+aum)*sal);
    }
}
