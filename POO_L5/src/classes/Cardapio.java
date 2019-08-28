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
public class Cardapio {
    private int cod;
    private int qnt;
    
    public double calcPreco() {
        double preco = 0;
        switch (cod) {
            case 100:
            case 103:
                preco = 1.2;
                break;
            case 101:
            case 104:
                preco = 1.3;
                break;
            case 102:
                preco = 1.5;
                break;
            case 105:
                preco = 1;
                break;
        }
        return preco * qnt;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        if (cod > 99  && cod < 106)
            this.cod = cod;
        else
            this.cod = 0;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        if (qnt > 0)
            this.qnt = qnt;
        else
            this.qnt = 0;
    }
}
