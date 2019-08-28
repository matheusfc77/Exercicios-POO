/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author matheus
 */
public class BancoTeste {
    public static void main(String[] args) {
        Banco b = new Banco();
        b.novaConta("12090834", "Matheus", 0);
        b.alteraNome("Matheus", "Carlos");
        b.deposito(100, "12090834");
        b.saque(25, "12090834");
        System.out.println("Informações conta: " + b.visualizarConta("12090834"));;
    }
}
