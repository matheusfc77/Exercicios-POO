/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class C20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double soma = 0;
        double n;
        int count = 0;
        
        System.out.println("Digite -1 para indicar o término das notas");
        
        do {
            System.out.printf("Informe n%d: ", count+1);
            n = Double.parseDouble(in.nextLine());
            soma += n;
            count++;
        } while (n != -1);
        
        count--;
        soma++;
        System.out.printf("Média: %.2f%n", soma/count);
    }
}
