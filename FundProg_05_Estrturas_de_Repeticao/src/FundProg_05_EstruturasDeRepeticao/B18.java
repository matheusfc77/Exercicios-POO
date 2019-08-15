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
public class B18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int divisor = 2;
        String divisores = "1";
        
        System.out.print("Informe um número: ");
        int n = in.nextInt();
        
        do {
            if (n % divisor == 0) {
                divisores += " " + divisor;
            }
            divisor++;
        } while (n > 2*divisor);
        
        if ("1".equals(divisores))
            System.out.printf("%d é primo", n);
        else {
            System.out.printf("%d não é primo%n", n);
            System.out.printf("Seus divisores são : %s", divisores);
        }
        
        System.out.println();
        in.close();
    }
}
