/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author nhlon
 */
public class TAILIEU {
    String MTL;
    String TENTL;
    String LOAI;
    String NGUON;
    String VITRI;

    public TAILIEU() {
    }

    public TAILIEU(String MTL, String TENTL, String LOAI, String NGUON, String VITRI) {
        this.MTL = MTL;
        this.TENTL = TENTL;
        this.LOAI = LOAI;
        this.NGUON = NGUON;
        this.VITRI = VITRI;
    }

    public String getMTL() {
        return MTL;
    }

    public void setMTL(String MTL) {
        this.MTL = MTL;
    }

    public String getTENTL() {
        return TENTL;
    }

    public void setTENTL(String TENTL) {
        this.TENTL = TENTL;
    }

    public String getLOAI() {
        return LOAI;
    }

    public void setLOAI(String LOAI) {
        this.LOAI = LOAI;
    }

    public String getNGUON() {
        return NGUON;
    }

    public void setNGUON(String NGUON) {
        this.NGUON = NGUON;
    }

    public String getVITRI() {
        return VITRI;
    }

    public void setVITRI(String VITRI) {
        this.VITRI = VITRI;
    }
    
}
