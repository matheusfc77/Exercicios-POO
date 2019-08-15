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
public class B13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fatorial = 1;
        
        System.out.print("Informe um número: ");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++)
            fatorial *= i;
        
        System.out.printf("Fatorial de %d: %d%n", n, fatorial);
        
        in.close();
    }
}
