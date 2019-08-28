/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author roberta.beltran
 */

class TesteOperacoesBasicas {
    public static void main(String[] args) {
        OperacoesBasicas pb = new OperacoesBasicas();
        pb.setN1(7);
        pb.setN2(5);
        System.out.println(pb.soma());
        System.out.println(pb.subtracao());
        System.out.println(pb.multiplicacao());
        System.out.println(pb.divisao());
    }
}

public class OperacoesBasicas {
    private int n1;
    private int n2;

    public int soma() {
        return n1 + n2;
    }
    
    public int subtracao() {
        return n1 - n2;
    }
    
    public int multiplicacao() {
        return n1 * n2;
    }
    
    public double divisao() {
        return (double) n1 / n2;
    }
    
    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
