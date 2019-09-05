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
public class Torre extends Peca {
    public boolean mover(int linha, int coluna) {
        if (this.getLinha() == linha && this.getColuna() != coluna || this.getLinha() != linha && this.getColuna() == coluna)
            return true;
        else
            return false;
    }
}
