/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundProg_05_EstruturasDeRepeticao;

/**
 *
 * @author mathe
 */
public class B15 {
    public static void main(String[] args) {
        double res = 0;
        int a = 37;
        int b = 38;
        int c = 1;
        
        System.out.printf("S = (%d*%d)/%d ", a, b, c);
        while (a > 0) {
            res += (double)(a*b)/c;
            a--;
            b--;
            c++;
            if (a > 0)
                System.out.printf("+ (%d*%d)/%d ", a, b, c);
        }
        System.out.printf("= %.2f%n", res);
    }
}
