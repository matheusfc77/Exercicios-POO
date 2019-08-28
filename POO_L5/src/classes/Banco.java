/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author matheus
 */
public class Banco {
    private ArrayList<String> numero = new ArrayList();
    private ArrayList<String> nome = new ArrayList();
    private ArrayList<Double> saldo = new ArrayList();

    private boolean validaDados(String numero, String nome, double saldo) {
        if (numero.length() == 8 && !this.numero.contains(numero) && nome.length() > 2 && !this.nome.contains(nome) && saldo >= 0) 
            return true;
        return false;
        
    }
    
    public void novaConta(String numero, String nome, double saldo) {
        if (validaDados(numero, nome, saldo)) {
            this.numero.add(numero);
            this.nome.add(nome);
            this.saldo.add(saldo);
        }
    }
    
    public String alteraNome(String nomeAnt, String nomeNv) {
        if (this.nome.contains(nomeAnt)) {
            this.nome.add(this.nome.indexOf(nomeAnt), nomeNv);
            return "Nome Alterado";
        } else
            return "Nome não cadastrado";
    }
    
    public String deposito(double vlr, String conta) {
        if (this.numero.contains(conta)) {
            if (vlr > 0) {
                int index = this.numero.indexOf(conta);
                this.saldo.add(index, this.saldo.get(index) + vlr);
                return "Depósito Realizado";
            } else
                return "Valor inválido";
        } else
            return "Conta não cadastrada";
    }
    
    public String saque(double vlr, String conta) {
        if (this.numero.contains(conta)) {
            int index = this.numero.indexOf(conta);
            if (vlr <= this.saldo.get(index)) {
                this.saldo.add(index, this.saldo.get(index) - vlr);
                return "Saque Realizado";
            } else
                return "Valor inválido";
        } else
            return "Conta não cadastrada";
    }
    
    public String visualizarConta(String conta) {
        if (this.numero.contains(conta)) {
            int index = this.numero.indexOf(conta);
            return "\n\tNúmero: " + conta + "\n\tNome: " + this.nome.get(index) + "\n\tSaldo: R$ " + this.saldo.get(index);
        } else 
            return "Conta não cadastrada";
    }
}
