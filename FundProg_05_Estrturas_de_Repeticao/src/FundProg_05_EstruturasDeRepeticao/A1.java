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
public class A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe uma nota entre 0 e 10: ");
        
        boolean verif = true;
        while (verif) {
            int n = in.nextInt();
            if (n <= 10 && n >= 0 ) {
                System.out.printf("Valor informado: %d%n", n);
                verif = false;
            } else 
                System.out.println("Nota inválida. Informe outro valor!");
        }
    }
}
