/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video;

/**
 *
 * @author matheus
 */
public class Teste {
    public static void main(String[] args) {
        //int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nomePessoa, String endereco
        // int codigo, String nomeBanco, int numeroAgencias, int agencia, int numeroDaConta, double saldo, String nomePessoa, String endereco, int diasSemJuros, double limite
        try {
            ContaSimples cs = new ContaSimples(10003, "SICOOB", 23, 54, 10005, 100, "Matheus", "Qualquer");
            cs.dopositoPoupanca(200);
            cs.saquePoupanca(50);
            
            ContaEspecial ce = new ContaEspecial(10007, "Santander", 26, 60, 10004, 500,"Letícia", "Anywhere", 10, 1000);
            ce.cartao.setTipoDeCartao("Débito");
            ce.saqueEspecial(300);
            
            System.out.println(cs);
            System.out.println(ce);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
