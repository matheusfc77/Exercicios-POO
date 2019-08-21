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
public class A2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double[][] pesq = new double[5][5];
        double[] mediaProd = new double[5];
        double[] somaMerc = new double[5];
        double prMin;
        double prMax;
        
        System.out.println("1-Novos Valores  2-Ler Últimos Valores");
        int v = Integer.parseInt(in.nextLine());
        if (v == 1) {
            GsonBuilder bd = new GsonBuilder();
            Gson gs = bd.create();
            FileWriter wr = new FileWriter("pesquisa.json");
            
            System.out.println("Informe o valor de cinco produtos de cinco supermercados:");
            for (int i = 0; i < pesq.length; i++) {
                System.out.printf("%nSupermercado %d:%n", i+1);
                for (int j = 0; j < pesq[i].length; j++) {
                    System.out.printf("\tProduto %d: ", j+1);
                    pesq[i][j] = Double.parseDouble(in.nextLine());
                    somaMerc[i] += pesq[i][j];
                }
            }

            for (int i = 0; i < pesq.length; i++) {
                for (int j = 0; j < pesq[i].length; j++) {
                    mediaProd[i] += pesq[j][i];
                }
                mediaProd[i] = mediaProd[i] / mediaProd.length;
            }  

            prMax = somaMerc[0];
            prMin = somaMerc[0];
            for (int i = 0; i < somaMerc.length; i++) {
                if (prMin > somaMerc[i])
                    prMin = somaMerc[i];
                else if (prMax < somaMerc[i])
                    prMax = somaMerc[i];
            }
            
            System.out.print("\nPesquisa Supermercados\n\tProd 1\tProd 2\tProd 3\tProd 4\tProd 5\tTotal");
            for (int i = 0; i < pesq.length; i++) {
                System.out.printf("%nSM %d", i+1);
                for (int j = 0; j < pesq[i].length; j++) {
                    System.out.printf("\t%.2f", pesq[i][j]);
                }
                System.out.printf("\t%.2f", somaMerc[i]);
            }
            System.out.printf("%nMédia\t");
            for (double i: mediaProd)
                System.out.printf("%.2f\t", i);

            System.out.printf("%n%nSupermercado mais barato: R$ %.2f%n", prMin);
            System.out.printf("Supermercado mais caro: R$ %.2f%n", prMax);
            
            wr.write(gs.toJson(pesq) + " ");
            wr.write(gs.toJson(mediaProd) + " ");
            wr.write(gs.toJson(somaMerc) + " ");
            wr.write(gs.toJson(prMin) + " ");
            wr.write(gs.toJson(prMax) + " ");
            wr.close();
            
        } else {
            FileReader fr = new FileReader("pesquisa.json");
            BufferedReader br = new BufferedReader(fr);
            String sb = null;
            String inf;
            while ((inf = br.readLine()) != null) {
                sb += inf;
            }
            String[] vlr = sb.replace("null", " ").trim().split(" ");
            String vPes = vlr[0].replace(",", " ");
            String vMedia = vlr[1].replace(",", " ");
            String vSoma = vlr[2].replace(",", " ");
            
            System.out.println("Tabela Pesquisa:");
            
            System.out.println(vPes);
            System.out.println("Média Produtos: " + vMedia);
            System.out.println("Soma Mercados: " + vSoma);
            System.out.printf("Supermercado mais barato: R$ %s%n", vlr[3]);
            System.out.printf("Supermercado mais caro: R$ %s%n", vlr[4]);
            
            br.close();
            fr.close();
        } 
        in.close();
    }
}
