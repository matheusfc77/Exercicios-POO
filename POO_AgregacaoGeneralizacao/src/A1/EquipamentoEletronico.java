/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1;

/**
 *
 * @author matheus
 */
public class EquipamentoEletronico {
    private double tensao;
    private double consumo;
    
    public EquipamentoEletronico() {
        tensao = 0;
        consumo = 0;
    }
    
    public EquipamentoEletronico(double tensao, double consumo) {
        this.tensao = tensao;
        this.consumo = consumo;
    }
    
    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        if (tensao <= 0 )
            throw new IllegalArgumentException("Tensão deve ser maior que 0");
            
        this.tensao = tensao;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        if (consumo <= 0)
            throw new IllegalArgumentException("Consumo deve ser maior que 0");
            
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return "EquipamentoEletronico{" + "tensao=" + tensao + ", consumo=" + consumo + '}';
    }
}
