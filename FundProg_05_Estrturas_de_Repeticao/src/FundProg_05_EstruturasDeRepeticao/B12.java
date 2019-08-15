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
public class B12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = 1;
        int a2 = 1;
        int elemento;
        
        System.out.print("Informe um número inteiro: ");
        int n = in.nextInt();
        
        if (n == 1)
            System.out.printf("Série Fibonacci até %dº elemento: %d%n", n, a1);
        else if (n >= 2) {
            System.out.printf("Série Fibonacci até %dº elemento:%n %d %d ", n, a1, a2);
  
            n -= 2;
            for (int i = 0; i < n; i++) {
                elemento = a1 + a2;
                System.out.printf("%d ", elemento);
                a2 = a1;
                a1 = elemento;
            }
        }
        System.out.println();
        
        in.close();
    }
}
