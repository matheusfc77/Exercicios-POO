/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author roberta.beltran
 */

class TesteConcatenaNome {
    public static void main(String[] args) {
        ConcatenaNome cn = new ConcatenaNome();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = in.nextLine();
        System.out.print("Informe o sobrenome: ");
        String sobrenome = in.nextLine();
        
        cn.setNome(nome);
        cn.setSobrenome(sobrenome);
        System.out.println(cn.nomeCompleto());
    }
}

public class ConcatenaNome {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 2)
            this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome.length() > 2)
            this.sobrenome = sobrenome;
    }
    
    public String nomeCompleto() {
        String nomeComp = "Seu nome completo é: " + nome + " " + sobrenome;
        return nomeComp;
    }
}
