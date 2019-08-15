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
public class B16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int menor;
        int maior;
        int soma;
        
        System.out.print("Informe a quantidade de números: ");
        int qnt = in.nextInt();
        
        System.out.print("Informe n1: ");
        int n = in.nextInt();
        menor = n;
        maior = n;
        soma = n;
        
        for (int i = 1; i < qnt; i++) {
            System.out.printf("Informe n%d: ", i+1);
            n = in.nextInt();
            soma += n;
            
            if (n > maior)
                maior = n;
            else if (n < menor)
                menor = n;
        }
        
        System.out.printf("Menor número informado: %d%n", menor);
        System.out.printf("Maior número informado: %d%n", maior);
        System.out.printf("Soma dos números: %d%n", soma);
    }
}
