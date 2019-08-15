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
public class C23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int alunos;
        int total = 0;
        
        System.out.print("Informe o número de turmas: ");
        int turmas = in.nextInt();
        
        for (int i = 0; i < turmas; i++) {
            System.out.printf("Informe o número de alunos da turma %d: ", i+1);
            alunos = in.nextInt();
            
            while (alunos > 40) {
                System.out.println("Número inválido. Cada turma pode ter no máximo 40 alunos");
                System.out.printf("Informe novamente o número de alunos da turma %d: ", i+1);
                alunos = in.nextInt();
            }
            total += alunos;
        }
        
        System.out.printf("Número médio de alunos por turma: %d%n", total/turmas);
    }
}
