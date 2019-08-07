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
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] vogais = {"a", "e", "i", "o", "u"};
        int aux = 0;
        
        System.out.print("Informe uma letra: ");
        String letra = (in.nextLine());
        
        for (String l : vogais) {
            if (l.equalsIgnoreCase(letra))
                aux = 1;
        }
        
        System.out.println((aux == 1) ? "Letra informada é vogal" : "Letra informada não é vogal");
    }
}
