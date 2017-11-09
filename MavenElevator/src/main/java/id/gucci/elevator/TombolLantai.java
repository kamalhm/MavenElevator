/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes.impal.oo;

/**
 *
 * @author Rohman
 */
public class TombolLantai extends Tombol {
    private int nomorLantai;
    private boolean arah;

    public int getNomorLantai() {
        return nomorLantai;
    }

    public boolean isArah() {
        return arah;
    }

    public void setNomorLantai(int nomorLantai) {
        this.nomorLantai = nomorLantai;
    }

    public void setArah(boolean arah) {
        this.arah = arah;
    }
    
}
