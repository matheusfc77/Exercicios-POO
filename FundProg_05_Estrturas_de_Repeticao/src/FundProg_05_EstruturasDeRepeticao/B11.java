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
public class B11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] val = new int[10];
        int pares = 0;
        int impares = 0;
        
        System.out.println("Informe dez números inteiros");
        for (int i = 0; i < 10; i++)
            val[i] = in.nextInt();
        
        for (int n: val) {
            if (n % 2 == 0)
                pares++;
            else
                impares++;
        }
        
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        
        in.close();
    }
}
