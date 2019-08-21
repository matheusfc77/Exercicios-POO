/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A3 {
    public static void main(String[] args) {
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
        
        System.out.printf("%nMaior Nota: %.1f\tAluno: %s", maxNot, nomeMaxNot);
        System.out.printf("%nMenor Nota: %.1f\tAluno: %s", minNot, nomeMinNot);
        System.out.printf("%nMaior Média: %.2f\tAluno: %s", maxMed, nomeMaxMed);
        System.out.printf("%nMenor Média: %.2f\tAluno: %s", minMed, nomeMinMed);
        System.out.printf("%nMédia da Turma: %.2f%n", medTur);
        
        System.out.println("\nAlunos acima da média: ");
        for (String a: alAcm)
            System.out.print(a + " ");
        
        System.out.println("\n\nAlunos abaixo da média: ");
        for (String a: alAbx)
            System.out.print(a + " ");
        
        System.out.println("");
        in.close();
    }
}
