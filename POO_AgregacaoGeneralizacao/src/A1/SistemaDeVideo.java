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
public class SistemaDeVideo extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String tipo;
    private String resolucao;

    public SistemaDeVideo() {
        marca = null;
        modelo = null;
        tipo = null;
        resolucao = null;
    }
    
    public SistemaDeVideo(String marca, String modelo, String tipo, String resolucao, double tensao, double consumo) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.resolucao = resolucao;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.length() == 0)
            throw new IllegalArgumentException("Marca deve ser informada");
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() == 0)
            throw new IllegalArgumentException("Modelo deve ser informado");
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.length() == 0)
            throw new IllegalArgumentException("Tipo deve ser informado");
        this.tipo = tipo;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        if (resolucao.length() == 0)
            throw new IllegalArgumentException("Resolução deve ser informada");
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        return "SistemaDeVideo{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", resolucao=" + resolucao + '}' + super.toString();
    }
    
}
