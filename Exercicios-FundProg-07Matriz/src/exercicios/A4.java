/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class A4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double minMed = 1000;
        double maxMed = 0;
        
        System.out.print("Informe o nº de atletas: ");
        int n = Integer.parseInt(in.nextLine());
        
        double[][] saltos = new double[n][5];   
        double[] medias = new double[n];
        
        System.out.println("Informe as distâncias em cm");
        for (int i = 0; i < saltos.length; i++) {
            double minSlt = 1000;
            double soma = 0;
            System.out.printf("%nAtleta %d:%n", i+1);
            for (int j = 0; j < saltos[i].length; j++) {
                System.out.printf("\tSalto %d: ", j+1);
                saltos[i][j] = Double.parseDouble(in.nextLine());
                if (minSlt > saltos[i][j])
                    minSlt = saltos[i][j];
            }
            for (int k = 0; k < saltos[i].length; k++)
                soma += saltos[i][k];
            medias[i] = (soma - minSlt) / 4;
            System.out.printf("\tMédia: %.2f cm%n", medias[i]);
            
            if (medias[i] > maxMed)
                maxMed = medias[i];
            else if (medias[i] < minMed)
                minMed = medias[i];
        }
        
        System.out.println("\n\tSlt 1\tSlt 2\tSlt 3\tSlt 4\tSlt 5\tMédia");
        for (int i = 0; i < saltos.length; i++) {
            System.out.printf("%nAtl %d", i+1);
            for (int j = 0; j < saltos[i].length; j++) {
                System.out.printf("\t%.2f", saltos[i][j]);
            }
            System.out.printf("\t%.2f", medias[i]);
        }
        System.out.printf("%n%nMédia Campeão: %.2f cm", maxMed);
        System.out.printf("%nMédia último lugar: %.2f cm%n", minMed);
        
        in.close();
    }
}
