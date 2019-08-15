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
public class C21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int idade;
        int soma = 0;
        int count = 0;
        int media;
        
        System.out.println("Digite -1 para indicar o fim das idades");
        
        do {
            System.out.printf("Informe a idade %d: ", count+1);
            idade = in.nextInt();
            count++;
            soma += idade;
        } while (idade != -1);
        
        count--;
        soma++;
        media = soma/count;
        
        if (media > 60)
            System.out.println("Turma idosa");
        else if (media > 25)
            System.out.println("Turma adulta");
        else
            System.out.println("Turma jovem");
        
        in.close();
    }
}
