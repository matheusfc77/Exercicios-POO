/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;


/**
 *
 * @author mathe
 */
public class B15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] idades = new int[30];
        double[] alt = new double[30];
        double somaAlt = 0;
        double media = 0;
        int numAlunos = 0;
    
        System.out.println("Informe a idade e a altura (em m) de 30 alunos:");
        for (int i = 0; i < alt.length; i++) {
            System.out.printf("\nAluno %d:%n\tIdade: ", i+1);
            idades[i] = Integer.parseInt(in.nextLine());
            System.out.print("\tAltura (m): ");
            alt[i] = Double.parseDouble(in.nextLine());
            somaAlt += alt[i];
        }
        media = somaAlt / alt.length;
        
        for (int i = 0; i < alt.length; i++) {
            if (idades[i] > 13 && alt[i] < media)
                numAlunos++;
        }
        
        System.out.printf("Número de alunos com mais de treze anos e altura menor que a média das alturas: %d%n", numAlunos);;
        
        in.close();
    }
}
