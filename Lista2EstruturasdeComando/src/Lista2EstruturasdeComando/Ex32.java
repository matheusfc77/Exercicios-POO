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
public class Ex32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] res = {"a", "a", "b", "b", "c", "c", "d", "d", "e", "e"};
        String r;
        int acertos = 0;
        
        System.out.println("Informe as repostas do candidato: ");
        for (int i = 0; i < res.length; i++) {
            System.out.printf("\tQuestão %d: ", i+1);
            r = in.next();
            
            if (res[i].equalsIgnoreCase(r))
                acertos++;
        }
        
        System.out.println("Pontuação Final: " + acertos);
        
    }
}
