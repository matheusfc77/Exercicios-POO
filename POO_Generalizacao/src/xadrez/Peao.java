/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

/**
 *
 * @author matheus
 */
public class Peao extends Peca {
    public boolean mover(int linha, int coluna) {
        if (this.getLinha() == linha - 1 && this.getColuna() == coluna)
            return true;
        else
            return false;
    }
}
