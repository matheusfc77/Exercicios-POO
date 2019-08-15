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
public class A8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux;
        int soma = 0;
        
        System.out.print("Informe um número inteiro: ");
        int a = in.nextInt();
        System.out.print("Informe outro número inteiro: ");
        int b = in.nextInt();
        
        if (b > a) {
            aux = a;
            a = b;
            b = aux;
        }
        
        b += 1;
        while (b < a) {
            System.out.print(b + " ");
            soma += b;
            b++;
        }
        
        System.out.printf("%nSoma dos números do intervalo: %d%n", soma);
        in.close();
    }
}
