/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class CardapioTeste {
    public static void main(String[] args) {
        Cardapio c = new Cardapio();
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> cod = new ArrayList();
        ArrayList<Integer> qnt = new ArrayList();
        double total = 0;
        double preco;
        String op = "";
        
        while(!"s".equalsIgnoreCase(op)) {
            System.out.print("Informe o código do lanche: ");
            cod.add(Integer.parseInt(in.nextLine()));
            System.out.print("Informe a quantidade: ");
            qnt.add(Integer.parseInt(in.nextLine()));
            System.out.print("Deseja encerrar o pedido (S/N)? ");
            op = in.nextLine();
        }
        System.out.println("Pedido:");
        for (int i = 0; i < cod.size(); i++) {
            c.setCod(cod.get(i));
            c.setQnt(qnt.get(i));
            preco = c.calcPreco();
            System.out.printf("\tItem %d: R$ %.2f%n", i+1, preco);
            total += preco;
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}
