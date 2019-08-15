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
public class C28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double temp;
        double menor;
        double maior;
        int count = 0;
        double total = 0;
        
        System.out.println("Digite -50 para informar o fim das temperaturas");
        
        System.out.printf("Temperatura %d: ", count+1);
        temp = Double.parseDouble(in.nextLine());
        menor = temp;
        maior = temp;
        
        do {
            if (temp < menor)
                menor = temp;
            else if (temp > maior)
                maior = temp;
            count++;
            total += temp;
            System.out.printf("Temperatura %d: ", count+1);
            temp = Double.parseDouble(in.nextLine());
        } while (temp != -50);
        
        System.out.printf("Menor temperatura: %.1f", menor);
        System.out.printf("%nMaior temperatura: %.1f", maior);
        System.out.printf("%nMédia das temperaturas: %.1f%n", total/count);
    }
}
