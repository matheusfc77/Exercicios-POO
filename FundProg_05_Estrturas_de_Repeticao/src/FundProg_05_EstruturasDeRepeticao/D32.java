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
public class D32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int cod;
        int codMenInd = 0;
        int codMaiorInd = 0;
        int numVeic;
        int numAcd;
        double indAcd;
        double menAcd = 1;
        double maiorAcd = 0;
        int totalVeic = 0;
        int acdCidPeq = 0;
        int contCidPeq = 0;
        
        System.out.println("Informe os dados das cinco cidades");
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("%nCidade %d:%n\tCódigo: ", i+1);
            cod = in.nextInt();
            System.out.print("\tNúmero de veículos: ");
            numVeic = in.nextInt();
            System.out.print("\tNúmero de acidentes de trânsito com vítimas: ");
            numAcd = in.nextInt();
            
            totalVeic += numVeic;
            indAcd = (double) numAcd/numVeic;
            if (indAcd < menAcd) {
                menAcd = indAcd;
                codMenInd = cod;
            } else if (indAcd > maiorAcd) {
                maiorAcd = indAcd;
                codMaiorInd = cod;
            }
            
            if (numVeic < 2000) {
                contCidPeq++;
                acdCidPeq += numAcd;
            } 
        }
        
        System.out.print("\nCidade com o menor índice de acidentes de trânsito");
        System.out.printf("%n\tCódigo: %d%n\tÍndice: %.4f%n", codMenInd, menAcd);
        System.out.print("\nCidade com o maior índice de acidentes de trânsito");
        System.out.printf("%n\tCódigo: %d%n\tÍndice: %.4f%n", codMaiorInd, maiorAcd);
        System.out.printf("%nMédia de veículos das cinco cidades: %d%n", totalVeic/5);
        System.out.printf("Média de acidesntes de trânsito em cidades com menos de 2000 veículos de passseio: %d%n", acdCidPeq/contCidPeq);
        
        
        in.close();
    }
}
