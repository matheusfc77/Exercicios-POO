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
public class B10 {
    static public void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int potencia = 1;
        
        System.out.print("Informe um número: ");
        int b = in.nextInt();
        System.out.print("Informe um número: ");
        int e = in.nextInt();
        
        for (int i = 0; i < e; i++)
            potencia *= b;
        
        System.out.printf("%d elevado a %d: %d%n", b, e, potencia);
        in.close();
    }
}
