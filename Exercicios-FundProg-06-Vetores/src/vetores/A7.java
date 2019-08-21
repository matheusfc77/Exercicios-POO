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
public class A7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] media = new double[10];
        int alunosApro = 0;
        
        System.out.print("Informe as quatro notas de dez alunos");
        for (int i = 0; i < media.length; i++) {
            int soma = 0;
            
            System.out.printf("%nInforme as notas do aluno %d:%n", i+1);
            for (int j = 0; j < 4; j++) {
                System.out.printf("n%d: ", j+1);
                soma += in.nextInt();
            }
            media[i] = (double) soma/4;
        }
        
        for (double i: media) {
            if (i >= 7)
                alunosApro++;
        }
        
        System.out.printf("Números de alunos com média >= 7.0: %d%n", alunosApro);

        in.close();
    }
}
