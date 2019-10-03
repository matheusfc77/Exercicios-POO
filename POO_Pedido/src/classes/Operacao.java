/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author matheus
 */
public class Operacao {
    private Date dtInicio;
    private Date dtFim;
    
    public Operacao() {
        dtInicio = new Date();
        dtFim = new Date();
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    @Override
    public String toString() {
        return "Operacao{" + "dtInicio=" + dtInicio + ", dtFim=" + dtFim + '}';
    }
    
}
