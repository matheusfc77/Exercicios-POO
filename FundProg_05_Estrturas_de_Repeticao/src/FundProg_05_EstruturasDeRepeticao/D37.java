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
public class D37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] gabarito = new String[10];
        String resp = null;
        int nota = 0;
        int numAlunos = 0;
        int totalNotas = 0;
        int maiorAcerto = 0;
        int menorAcerto = 10;
        
        System.out.println("Informe o gabarito da Prova:");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.printf("Questão %d: ", i+1);
            gabarito[i] = in.next();
        }
        System.out.println("Correções");
        do {
            System.out.printf("%nAluno %d%n", numAlunos+1);
            for (int i = 0; i < 10; i++) {
                System.out.printf("\tQuestão %d: ",i+1);
                resp = in.next();
                
                if (gabarito[i].equalsIgnoreCase(resp))
                    nota++;
            }
            if (menorAcerto > nota)
                menorAcerto = nota;
            else if (maiorAcerto < nota)
                maiorAcerto = nota;
            
            numAlunos++;
            totalNotas += nota;
            System.out.print("Deseja realizar nova correção (S/N)? ");
            resp = in.next();
        } while (!"n".equalsIgnoreCase(resp));
        
        System.out.printf("Maior Acerto: %d%n", maiorAcerto);
        System.out.printf("Menor Acerto: %d%n", menorAcerto);
        System.out.printf("Total de alunos que utilizaram o sistema: %d%n", numAlunos);
        System.out.printf("Média das notas: %.2f%n", (double) totalNotas/numAlunos);
        
        in.close();
    
    }
}
