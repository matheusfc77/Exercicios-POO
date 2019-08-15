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
public class D33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] parcelas = {1, 3, 6, 9, 12};
        int[] juros = {0, 10, 15, 20, 25};
        
        System.out.print("Informe o valor da dívida: R$ ");
        double div = Double.parseDouble(in.nextLine());
        
        System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");
        for (int i = 0; i < parcelas.length; i++) {
            System.out.printf("R$ %.2f\t\tR$ %.2f\t\t%d\t\tR$ %.2f%n", div+div*(juros[i]/100.0), div*(juros[i]/100.0), parcelas[i], (div*(1+juros[i]/100.0))/parcelas[i]);
        }
        
        in.close();
    }
}
