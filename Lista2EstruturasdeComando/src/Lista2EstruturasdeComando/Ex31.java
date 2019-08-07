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
public class Ex31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] precos = {{4.9, 5.8}, {5.9, 6.8}, {6.9, 7.8}};
        double v = 0;
        
        System.out.print("Informe o tipo da carne (FD-File Duplo / A-ALcatra/ P-Picanha): ");
        String t = in.next();
        in.nextLine();
        System.out.print("Informe a quantidade (em kg): ");
        double q = Double.parseDouble(in.nextLine());
        System.out.print("Como deseja efetuar o pagamento ? (Digite CT para Cartão Tabajara) ");
        String c = in.next();
        
        if (q > 5) {
            switch (t) {
                case "FD":
                    v = precos[0][1] * q;
                    break;
                case "A":
                    v = precos[1][1] * q;
                    break;
                case "P":
                    v = precos[2][1] * q;     
            }
        } else {
            switch (t) {
                case "FD":
                    v = precos[0][0] * q;
                    break;
                case "A":
                    v = precos[1][0] * q;
                    break;
                case "P":
                    v = precos[2][0] * q;     
            }
        }
        
        if (c.equals("CT"))
            v *= 0.95;
        
        System.out.println("Cupom Fiscal");
        System.out.printf("\tTipo de carne: %s", t);
        System.out.printf("%n\tQuantidade: %.2f kg", q);
        System.out.printf("%n\tPreço Total: R$ %.2f", v);
        System.out.printf("%n\tTipo de Pagamento: %s%n", c);
    }
}
