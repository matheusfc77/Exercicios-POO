/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author mathe
 */
public class A9 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int ran;
        String alfabeto = "aeioubcdfghjklmnpqrstvxwyz";
        Scanner in = new Scanner(System.in);
        String senha = "";
        
        System.out.print("Informe o tamanho da senha (max 26): ");
        int tam = in.nextInt();
        
        if (tam < alfabeto.length()) {
            for (int i = 0; i < tam; i++) {
                if (i % 2 == 0) {
                    ran = 5 + gerador.nextInt(21);
                    senha += alfabeto.substring(ran, ran+1);
                } else {
                    ran = gerador.nextInt(5);
                    senha += alfabeto.substring(ran, ran+1);
                }
            }
            System.out.printf("Senha: %s%n", senha);
        } else
            System.out.println("Tamanho inválido");
        
        in.close();
    }
}
