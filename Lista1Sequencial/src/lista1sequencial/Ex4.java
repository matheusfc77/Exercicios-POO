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
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tt = 0;
        
        System.out.print("Insira quatro notas");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%nInforme a nota%d: ", i + 1);
            double n = Double.parseDouble(in.nextLine());
            tt += n;
        }
        
        System.out.printf("%nA média das notas informadas é: %.2f%n", tt/4);
    }
}
