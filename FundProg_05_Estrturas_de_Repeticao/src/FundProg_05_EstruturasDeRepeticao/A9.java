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
public class A9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe um número inteiro entre 1 a 10: ");
        int n = in.nextInt();
        
        System.out.println("Tabuada do " + n);
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n*i);
        }
        
        in.close();
    }
}
