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
public class D31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num;
        int menNum = 0;
        int maiorNum = 0;
        int alt = 0;
        int menAlt = 1000;
        int maiorAlt = 0;
        
        System.out.println("Informe o número e o tamanho (em cm) de 10 alunos");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("%nNúmero aluno %d: ", i+1);
            num = in.nextInt();
            System.out.printf("Altura aluno %d: ", i+1);
            alt = in.nextInt();
            
            if (alt < menAlt) {
                menAlt = alt;
                menNum = num;
            } else if (alt > maiorAlt) {
                maiorAlt = alt;
                maiorNum = num;
            }
        }
         
        System.out.printf("%nAluno mais baixo:%n\tNúmero: %d%n\tAltura: %d cm%n", menNum, menAlt);
        System.out.printf("%nAluno mais alto:%n\tNúmero: %d%n\tAltura: %d cm%n", maiorNum, maiorAlt);
        
        in.close();
    }
}
