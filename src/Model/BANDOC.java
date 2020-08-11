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
public class BANDOC {
    String MBD;
    String TENBD;
    String NGAYSINH;
    String CCCD;
    String SDT;
    String EMAIL;
    Date NGAYTAO;

    public BANDOC() {
    }

    public BANDOC(String MBD, String TENBD, String NGAYSINH, String CCCD, String SDT, String EMAIL, Date NGAYTAO) {
        this.MBD = MBD;
        this.TENBD = TENBD;
        this.NGAYSINH = NGAYSINH;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.EMAIL = EMAIL;
        this.NGAYTAO = NGAYTAO;
    }

    public String getMBD() {
        return MBD;
    }

    public String getTENBD() {
        return TENBD;
    }

    public String getNGAYSINH() {
        return NGAYSINH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public Date getNGAYTAO() {
        return NGAYTAO;
    }

    public void setMBD(String MBD) {
        this.MBD = MBD;
    }

    public void setTENBD(String TENBD) {
        this.TENBD = TENBD;
    }

    public void setNGAYSINH(String NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setNGAYTAO(Date NGAYTAO) {
        this.NGAYTAO = NGAYTAO;
    }
    
}
