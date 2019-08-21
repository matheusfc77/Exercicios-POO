/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A5 {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Quantas cartelas deseja preencher? ");
        int c = in.nextInt();
        
        int[][] jogos = new int[c][6];
        for (int i = 0; i < jogos.length; i++) {
            for (int j = 0; j < jogos[i].length; j++) {
                // números diferentes
                boolean dif = true;
                int n = 0;
                while (dif) {
                    n = 1 + ran.nextInt(60);
                    for (int k = 0; k < jogos[i].length; k++) {
                        if (n == jogos[i][k])
                            break;
                        else if (n != jogos[i][k] && k == 5)
                            dif = false;
                    }
                }
                jogos[i][j] = n;
            }
            // ordenação
            for (int j = 0; j < jogos[i].length - 1; j++) {
                for (int k = j; k < jogos[i].length; k++) {
                    int aux;
                    if (jogos[i][j] > jogos[i][k]) {
                        aux = jogos[i][j];
                        jogos[i][j] = jogos[i][k];
                        jogos[i][k] = aux;
                    }
                }
            }
        }
        
        int[] res = new int[6];
        System.out.println("\nInforme o resultado do sorteio:");
        for (int i = 0; i < res.length; i++) {
            System.out.printf("n%d: ", i+1);
            res[i] = in.nextInt();
        }
        
        // numero de acertos
        int[] act = new int[c];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < jogos.length; j++) {
                for (int k = 0; k < jogos[j].length; k++) {
                    if (res[i] == jogos[j][k])
                        act[j]++;
                }
            }
        }
        
        System.out.print("\n\tn1\tn2\tn3\tn4\tn5\tn6\tacertos");
        System.out.print("\nRst");
        for (int k = 0; k < res.length; k++)
            System.out.printf("\t%d", res[k]);
        for (int i = 0; i < jogos.length; i++) {
            System.out.printf("%ncrt%d", i+1);
            for (int j = 0; j < jogos[i].length; j++) {
                System.out.printf("\t%d", jogos[i][j]); 
            }
            System.out.printf("\t%d", act[i]);
        }
        System.out.println();
        
        in.close();
    }
}
