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
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A3 {
    
    public static void mostrar(double maxNot, String nomeMaxNot, double minNot, String nomeMinNot, double maxMed, String nomeMaxMed, double minMed, String nomeMinMed, double medTur) {
        System.out.printf("%nMaior Nota: %.1f\tAluno: %s", maxNot, nomeMaxNot);
        System.out.printf("%nMenor Nota: %.1f\tAluno: %s", minNot, nomeMinNot);
        System.out.printf("%nMaior Média: %.2f\tAluno: %s", maxMed, nomeMaxMed);
        System.out.printf("%nMenor Média: %.2f\tAluno: %s", minMed, nomeMinMed);
        System.out.printf("%nMédia da Turma: %.2f%n", medTur);
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String nome;
        double maxNot = 0;
        String nomeMaxNot = null;
        double minNot = 10;
        String nomeMinNot = null;
        double maxMed = 0;
        String nomeMaxMed = null;
        double minMed = 10;
        String nomeMinMed = null;
        double medTur = 0;
        ArrayList<String> alAbx = new ArrayList<String>();
        ArrayList<String> alAcm = new ArrayList<String>();
        
        System.out.println("1-Novos Valores  2-Ler Últimos Valores");
        int v = Integer.parseInt(in.nextLine());
        if (v == 1) {
            GsonBuilder bd = new GsonBuilder();
            Gson gs = bd.create();
            FileWriter wt = new FileWriter("alunos.json");
            
            System.out.print("Informe o nº de alunos: ");
            int n = Integer.parseInt(in.nextLine());
            String[] nomes = new String[n];
            double[] notas1 = new double[n];
            double[] notas2 = new double[n];
            double[] medias = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Aluno %d:%n\tNome: ", i+1);
                nomes[i] = in.nextLine();
                System.out.print("\tNota 1: ");
                notas1[i] = Double.parseDouble(in.nextLine());
                System.out.print("\tNota 2: ");
                notas2[i] = Double.parseDouble(in.nextLine());
                medias[i] = (notas1[i] + notas2[i]) / 2;
                medTur += medias[i];

                if (notas1[i] <= notas2[i] && minNot > notas1[i]) {
                    minNot = notas1[i];
                    nomeMinNot = nomes[i];
                } else if (notas2[i] < notas1[i] && minNot > notas2[i]) {
                    minNot = notas2[i];
                    nomeMinNot = nomes[i];
                }

                if (notas1[i] >= notas2[i] && maxNot < notas1[i]) {
                    maxNot = notas1[i];
                    nomeMaxNot = nomes[i];
                } else if (notas2[i] > notas1[i] && maxNot < notas2[i]) {
                    maxNot = notas2[i];
                    nomeMaxNot = nomes[i];
                }

                if (maxMed < medias[i]) {
                    maxMed = medias[i];
                    nomeMaxMed = nomes[i];
                } else if (minMed > medias[i]) {
                    minMed = medias[i];
                    nomeMinMed = nomes[i];
                }
            }
            medTur = medTur / n;

            for (int i = 0; i < n; i++) {
                if (medias[i] < medTur)
                    alAbx.add(nomes[i]);
                else if (medias[i] > medTur)
                    alAcm.add(nomes[i]);
            }

            for (int i = 0; i < n; i++) 
                System.out.printf("Aluno %d:%n\tNome: %s%n\tNota 1: %.1f%n\tNota 2: %.1f%n\tMédia: %.2f%n", i+1, nomes[i], notas1[i], notas2[i], medias[i]);
            
            mostrar(maxNot, nomeMaxNot, minNot, nomeMinNot, maxMed, nomeMaxMed, minMed, nomeMinMed, medTur);
            
            System.out.println("\nAlunos acima da média: ");
            for (String a: alAcm)
                System.out.print(a + " ");

            System.out.println("\n\nAlunos abaixo da média: ");
            for (String a: alAbx)
                System.out.print(a + " ");

            System.out.println("");
            
            wt.write(gs.toJson(nomes) + "/");
            wt.write(gs.toJson(notas1) + "/");
            wt.write(gs.toJson(notas2) + "/");
            wt.write(gs.toJson(medias) + "/");
            wt.write(gs.toJson(maxNot) + "/");
            wt.write(gs.toJson(nomeMaxNot) + "/");
            wt.write(gs.toJson(minNot) + "/");
            wt.write(gs.toJson(nomeMinNot) + "/");
            wt.write(gs.toJson(maxMed) + "/");
            wt.write(gs.toJson(nomeMaxMed) + "/");
            wt.write(gs.toJson(minMed) + "/");
            wt.write(gs.toJson(nomeMinMed) + "/");
            wt.write(gs.toJson(medTur) + "/");
            wt.write(gs.toJson(alAcm) + "/");
            wt.write(gs.toJson(alAbx));
            wt.close();
        } else {
            FileReader fr = new FileReader("alunos.json");
            BufferedReader br = new BufferedReader(fr);
            String sb = null;
            String inf;
            while ((inf = br.readLine()) != null) {
                sb += inf;
            }
            String[] vlr = sb.replace("null", "").split("/");
            
            System.out.println("Alunos: " + vlr[0]);
            System.out.println("Notas 1: " + vlr[1]);
            System.out.println("Notas 2: " + vlr[2]);
            System.out.println("Médias: " + vlr[3]);
            mostrar(Double.parseDouble(vlr[4]), vlr[5], Double.parseDouble(vlr[6]), vlr[7], Double.parseDouble(vlr[8]), vlr[9], Double.parseDouble(vlr[10]), vlr[11], Double.parseDouble(vlr[12]));
            System.out.println("Alunos acima da média: " + vlr[13]);
            System.out.println("Alunos abaixo da média: " + vlr[14]);
            br.close();
            fr.close();
        }
        
        
        in.close();
    }
}
