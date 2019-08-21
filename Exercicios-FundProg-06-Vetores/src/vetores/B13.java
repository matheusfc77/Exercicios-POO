/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author mathe
 */
public class B13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] idade = new int[5];
        double[] alt = new double[5];
        int somaIdd = 0;
        double somaAlt = 0;
        double mediaIdd;
        double mediaAlt;
        int iddMax = 0;
        int iddMin = 130;
        double altMax = 0;
        double altMin = 3;
        double auxIddMax = 0;
        double auxIddMin = 0;
        int auxAltMax = 0;
        int auxAltMin = 0;
        
        ArrayList<Integer> iddMaiorMedia = new ArrayList();
        ArrayList<Integer> iddMenorMedia = new ArrayList();
        ArrayList<Double> altMaiorMedia = new ArrayList();
        ArrayList<Double> altMenorMedia = new ArrayList();
        
        System.out.println("Informe a idade e a altura (m) de cinco pessoas:");
        for (int i = 0; i < alt.length; i++) {
            System.out.printf("Pessoa %d:%n\tIdade: ", i+1);
            idade[i] = Integer.parseInt(in.nextLine());
            System.out.printf("\tAltura: ");
            alt[i] = Double.parseDouble(in.nextLine());
            somaIdd += idade[i];
            somaAlt += alt[i];
        }
        
        mediaAlt = somaAlt / alt.length;
        mediaIdd = somaIdd / idade.length;
        
        System.out.println("\nDados em forma inversa\nIdade\t\tAltura");
        for (int i = alt.length - 1; i > -1; i--) {
            System.out.printf("%d\t\t%.2f%n", idade[i], alt[i]);
            
            if (idade[i] > iddMax) {
                iddMax = idade[i];
                auxIddMax = alt[i];
            } else if (idade[i] < iddMin) {
                iddMin = idade[i];
                auxIddMin = alt[i];
            }
            
            if (alt[i] > altMax) {
                altMax = alt[i];
                auxAltMax = idade[i];
            } else if(alt[i] < altMin) {
                altMin = alt[i];
                auxAltMin = idade[i];
            }
            
            if (idade[i] < mediaIdd)
                iddMenorMedia.add(idade[i]);
            else if (idade[i] > mediaIdd)
                iddMaiorMedia.add(idade[i]);
            
            if (alt[i] < mediaAlt)
                altMenorMedia.add(alt[i]);
            else if (alt[i] > mediaAlt)
                altMaiorMedia.add(alt[i]);
        }
        System.out.printf("%nMais velho: %d\t\tAltura: %.2f%n", iddMax, auxIddMax);
        System.out.printf("Mais novo: %d\t\tAultura: %.2f%n", iddMin, auxIddMin);
        System.out.printf("Mais alto: %.2f\t\tIdade: %d%n", altMax, auxAltMax);
        System.out.printf("Mais baixo: %.2f\t\tIdade: %d%n", altMin, auxAltMin);
        
        System.out.print("\nIdades acima da média: ");
        for (int i: iddMaiorMedia)
            System.out.printf("%d ", i);
        
        System.out.print("\nIdades abaixo da média: ");
        for (int i: iddMenorMedia)
            System.out.printf("%d ", i);
        
        System.out.print("\nAlturas acima da média: ");
        for (double i: altMaiorMedia)
            System.out.printf("%.2f ", i);
        
        System.out.print("\nAlturas abaixo da média: ");
        for (double i: altMenorMedia)
            System.out.printf("%.2f ", i);
        
        in.close();
    }
}
