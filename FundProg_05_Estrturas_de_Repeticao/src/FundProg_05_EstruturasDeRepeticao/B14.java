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
public class B14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int den = 1;
        
        System.out.print("Informe um número: ");
        int n = in.nextInt();
        
        System.out.print("S = 1/1");
        for (int i = 2; i <= n; i++) {
            den += 2;
            System.out.printf(" + %d/%d", i, den);
        }
        System.out.println();
    }
}
