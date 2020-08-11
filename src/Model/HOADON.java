/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author nhlon
 */
public class HOADON {
    String MHD;
    String MBD;
    String MTL;
    Date NGAYMUON;
    boolean HOANTRA;

    public HOADON() {
    }

    public HOADON(String MHD, String MBD, String MTL, Date NGAYMUON, boolean HOANTRA) {
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

    public Date getNGAYMUON() {
        return NGAYMUON;
    }

    public boolean isHOANTRA() {
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

    public void setNGAYMUON(Date NGAYMUON) {
        this.NGAYMUON = NGAYMUON;
    }

    public void setHOANTRA(boolean HOANTRA) {
        this.HOANTRA = HOANTRA;
    }
    
}
