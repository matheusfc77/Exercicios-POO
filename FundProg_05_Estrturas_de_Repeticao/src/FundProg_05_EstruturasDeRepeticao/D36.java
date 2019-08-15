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
public class D36 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int[] votos = new int[6];
        int total = 0;
        String[] opcoes = {"João", "Leandro", "Caroline", "Bruna", "Nulo", "Em Branco"};
        
        System.out.println("Digite 0 para encerrar a votação");
        System.out.println("Opções de voto:");
        for (String op: opcoes)
            System.out.printf("%s  ", op);
        System.out.print("\nDigite o número do candidato(a): ");
        int voto = in.nextInt();
        
        while (voto != 0) {
            switch (voto) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                case 4: 
                    votos[3]++;
                    break;
                case 5:
                    votos[4]++;
                    break;
                case 6:
                    votos[5]++;
            }
            total++;
            System.out.print("Digite o número do candidato(a): ");
            voto = in.nextInt();
        }
        
        System.out.println("Resultado das eleições\nCandidato   Votos");
        for (int i = 0; i < opcoes.length; i++)
            System.out.printf("%s\t%d%n", opcoes[i], votos[i]);
        
        System.out.printf("Porcentagem dos votos nulos: %d%n", (100*votos[4])/total);
        System.out.printf("Porcentagem dos votos em brando: %d%n", (votos[5]*100)/total);
        
        in.close();
    }
}
