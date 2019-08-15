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
public class C24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        double valor;
        double total = 0;
        
        System.out.println("Digite -1 para finalizar os valores dos CDs\nInforme todos os valores em reais");
        
        do {
            System.out.printf("Informe o valor do CD %d: ", count+1);
            valor = Double.parseDouble(in.nextLine());
            count++;
            total += valor;
        } while (valor != -1);
        
        count--;
        total++;
        
        System.out.printf("Valor médio gasto em cada CD: R$ %.2f%n", total/count);
        System.out.printf("Valor total investido: R$ %.2f%n", total);
        
        in.close();
    }
}
