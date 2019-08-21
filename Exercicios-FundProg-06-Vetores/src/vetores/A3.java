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
public class A3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int QNTELEMENTOS = 10;
        int[] numeros = new int[QNTELEMENTOS];
        ArrayList<Integer> pares = new ArrayList();
        ArrayList<Integer> impares = new ArrayList();
        ArrayList<Integer> maiorMedia = new ArrayList();
        ArrayList<Integer> menorMedia = new ArrayList();
        int soma = 0;
        int maior;
        int menor; 
        double media;
        
        System.out.println("Informe dez valores inteiros:");
        for (int i = 0; i < QNTELEMENTOS; i++) {
            System.out.printf("n%d: ", i+1);
            numeros[i] = in.nextInt();
            soma += numeros[i];
        }
        
        media = (double) soma / QNTELEMENTOS;
        maior = numeros[0];
        menor = numeros[0];
        
        for (int i = 0; i < QNTELEMENTOS; i++) {
            if (maior < numeros[i])
                maior = numeros[i];
            else if (menor > numeros[i])
                menor = numeros[i];
            
            if (numeros[i] > media)
                maiorMedia.add(numeros[i]);
            else if (numeros[i] < media)
                menorMedia.add(numeros[i]);
            
            if (numeros[i] % 2 == 0)
                pares.add(numeros[i]);
            else
                impares.add(numeros[i]);
        }
        
        System.out.printf("%nSoma: %d%n", soma);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Maior: %d%n", maior);
        System.out.printf("Menor: %d%n", menor);
        
        System.out.print("\nPares: ");
        for (int i: pares)
            System.out.printf("%d ", i);
        
        System.out.print("\nÍmpares: ");
        for (int i: impares)
            System.out.printf("%d ", i);
        
        System.out.print("\nAcima da média: ");
        for (int i: maiorMedia)
            System.out.printf("%d ", i);
        
        System.out.print("\nAbaixo da média: ");
        for (int i: menorMedia)
            System.out.printf("%d ", i);
        
        System.out.println();
                
    }
}
