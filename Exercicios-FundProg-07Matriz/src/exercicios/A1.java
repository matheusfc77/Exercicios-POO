/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mathe
 */

public class A1 {
    
    public static void mostrar(int soma, double media, int vlrMax, int vlrMin, int numPares, int numImp, int dgPrin, int dgSec) {
        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Menor valor: %d%n", vlrMax);
        System.out.printf("Maior valor: %d%n", vlrMin);
        System.out.printf("Qntd de pares: %d%n", numPares);
        System.out.printf("Qntd de ímpares: %d%n", numImp);
        System.out.printf("Soma da diagonal principal: %d%n", dgPrin);
        System.out.printf("Soma da diagonal secundária: %d%n", dgSec);
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        double media = 0;
        int vlrMax = 0;
        int vlrMin = 0;
        int numPares = 0;
        int numImp = 0;
        int dgPrin = 0;
        int dgSec = 0;
        boolean teste = true;
        
        System.out.println("1-Novos Valores  2-Ler Últimos Valores");
        int v = in.nextInt();
        if (v == 1) {
            GsonBuilder bd = new GsonBuilder();
            Gson gs = bd.create();
            FileWriter wr = new FileWriter("matriz.json");
            
            System.out.print("Informe um número ímpar entre 3 e 11 (inclusive): ");
            int n = in.nextInt();

            while (teste) {
                if (n % 2 == 1 && n > 2 && n < 12) {
                    int[][] m = new int[n][n];
                    System.out.printf("Preencha os valores de uma matriz %dx%d%n", n, n);
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m[i].length; j++) {
                            System.out.printf("n%d%d: ", i+1, j+1);
                            m[i][j] = in.nextInt();
                        }
                    }

                    vlrMax = m[0][0];
                    vlrMin = m[0][0];
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j <m[i].length; j++) {
                            soma += m[i][j];

                            if (m[i][j] > vlrMax)
                                vlrMax = m[i][j];
                            else if (m[i][j] < vlrMin)
                                vlrMin = m[i][j];

                            if (m[i][j] % 2 == 0)
                                numPares++;
                            else 
                                numImp++;
                        }
                    }

                    int auxM = m.length - 1;
                    for (int i = 0; i < m.length; i++) {
                        dgSec += m[i][auxM];
                        auxM--;
                    }

                    for (int i = 0; i < m.length; i++)
                        dgPrin += m[i][i];

                    System.out.println("\nMatriz informada:");
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m[i].length; j++) {
                            System.out.printf("%d\t", m[i][j]);
                        }
                        System.out.println();
                    }
                    media = (double) soma / (m.length * m.length);

                    mostrar(soma, media, vlrMin, vlrMax, numPares, numImp, dgPrin, dgSec);
                    
                    wr.write(gs.toJson(m) + " ");
                    wr.write(gs.toJson(soma) + " ");
                    wr.write(gs.toJson(media) + " ");
                    wr.write(gs.toJson(vlrMin) + " ");
                    wr.write(gs.toJson(vlrMax) + " ");
                    wr.write(gs.toJson(numPares) + " ");
                    wr.write(gs.toJson(numImp) + " ");
                    wr.write(gs.toJson(dgPrin) + " ");
                    wr.write(gs.toJson(dgSec) + " ");
                    
                    teste = false;
                } else {
                    System.out.print("\nNúmero inválido. Tente novamente: ");
                    n = in.nextInt();
                }
            }
            wr.close();
        } else {
            FileReader fr = new FileReader("matriz.json");
            BufferedReader br = new BufferedReader(fr);
            String sb = null;
            String inf;
            while ((inf = br.readLine()) != null) {
                sb += inf;
            }
            String[] vlr = sb.replace("null", " ").trim().split(" ");
            
            System.out.println(vlr[0]);
            
            soma = Integer.parseInt(vlr[1]);
            media = Double.parseDouble(vlr[2]);
            vlrMin = Integer.parseInt(vlr[3]);
            vlrMax = Integer.parseInt(vlr[4]);
            numPares = Integer.parseInt(vlr[5]);
            numImp = Integer.parseInt(vlr[6]);
            dgPrin = Integer.parseInt(vlr[7]);
            dgSec = Integer.parseInt(vlr[8]);
            mostrar(soma, media, vlrMin, vlrMax, numPares, numImp, dgPrin, dgSec);
            
            br.close();
            fr.close();
        }
        in.close();
    }
}
