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
public class C22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int voto;
        int can1 = 0;
        int can2 = 0;
        int can3 = 0;
        
        System.out.print("Informe o número de votantes: ");
        int nVotos = in.nextInt();
        
        for (int i = 0; i < nVotos; i++) {
            System.out.print("Informe o candidato (1, 2 ou 3): ");
            voto = in.nextInt();
            
            switch (voto) {
                case 1:
                    can1++;
                    break;
                case 2:
                    can2++;
                    break;
                case 3:
                    can3++;
                    break;
            }
        }
        
        System.out.printf("%nResultado%n  Candidato   Votos%n");
        System.out.printf("\t1\t%d%n\t2\t%d%n\t3\t%d%n", can1, can2, can3);
                
        in.close();    
    }
}
