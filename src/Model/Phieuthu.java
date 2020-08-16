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
public class Phieuthu {
    String MHD;
    String MBD;
    String MTL;
    String NGAYMUON;
    String HOANTRA;

    public Phieuthu() {
    }

    public Phieuthu(String MHD, String MBD, String MTL, String NGAYMUON, String HOANTRA) {
        this.MHD = MHD;
        this.MBD = MBD;
        this.MTL = MTL;
        this.NGAYMUON = NGAYMUON;
        this.HOANTRA = HOANTRA;
    }

    public String getMHD() {
        return MHD;
    }

    public String getMBD() {
        return MBD;
    }

    public String getMTL() {
        return MTL;
    }

    public String getNGAYMUON() {
        return NGAYMUON;
    }

    public String getHOANTRA() {
        return HOANTRA;
    }

    public void setMHD(String MHD) {
        this.MHD = MHD;
    }

    public void setMBD(String MBD) {
        this.MBD = MBD;
    }

    public void setMTL(String MTL) {
        this.MTL = MTL;
    }

    public void setNGAYMUON(String NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public void setHOANTRA(String HOANTRA) {
        this.HOANTRA = HOANTRA;
    }
    
}
