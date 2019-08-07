/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2EstruturasdeComando;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String r;
        String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", 
                              "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"};
        
        System.out.println("Responda as próximas 5 perguntas com S (sim) ou N (não)");
        for (String p: perguntas)   {
            System.out.printf("\t%s ", p);
            r = in.next();
            if (r.equalsIgnoreCase("s")) 
                count++;
        }
        
        switch (count) {
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
        }
    }
}
