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
public class HomeTheater {
    protected SistemaDeSom sistemaSom;
    protected SistemaDeVideo sistemaVideo;
    
    public HomeTheater() {
        sistemaSom = new SistemaDeSom();
        sistemaVideo = new SistemaDeVideo();
    }

    public HomeTheater(SistemaDeSom sistemaSom, SistemaDeVideo sistemaVideo) {
        this.sistemaSom = sistemaSom;
        this.sistemaVideo = sistemaVideo;
    }

    public SistemaDeSom getSistemaSom() {
        return sistemaSom;
    }

    public void setSistemaSom(SistemaDeSom sistemaSom) {
        this.sistemaSom = sistemaSom;
    }

    public SistemaDeVideo getSistemaVideo() {
        return sistemaVideo;
    }

    public void setSistemaVideo(SistemaDeVideo sistemaVideo) {
        this.sistemaVideo = sistemaVideo;
    }

    @Override
    public String toString() {
        return "HomeTheater{" + "sistemaSom=" + sistemaSom + ", sistemaVideo=" + sistemaVideo + '}';
    }
    
    
    
}
