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
public class B17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divisor = 2;
        
        System.out.print("Informe um número: ");
        int n = in.nextInt();
        
        do {
            if (n % divisor == 0) {
                System.out.printf("%d não é primo%n", n);
                break;
            }
            divisor++;
        } while (n > 2*divisor);
        
        if (n < 2*divisor)
            System.out.printf("%d é primo%n", n);
    }
}
