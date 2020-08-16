/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.Jdbc;
import Model.Bandoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nhlon
 */
public class BandocDAO {
    public void insertBD(Bandoc bd){
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
                ps = con.prepareStatement("INSERT INTO BANDOC VALUES (?, ?, ?, ?, ?, ? ,?)");
                ps.setString(1, bd.getMBD());
                ps.setString(2, bd.getTENBD());
                ps.setString(3, bd.getNGAYSINH());
                ps.setString(4, bd.getCCCD());
                ps.setString(5, bd.getSDT());
                ps.setString(6, bd.getEMAIL());
                ps.setString(7, bd.getNGAYTAO());
                if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Đã nhập bạn đọc mới");
                }else{
                        JOptionPane.showMessageDialog(null, "Không thêm được bạn đọc mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
        } catch (SQLException ex) {
                System.out.println("Error");
                Logger.getLogger(BandocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateBD(Bandoc bd){
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        String sql = "UPDATE BANDOC SET TENBD= ?, NGAYSINH= ?, CCCD= ?, SDT = ?, EMAIL = ?, NGAYTAO = ? WHERE MBD = ?";
        try {
                ps = con.prepareStatement(sql);
                ps.setString(1, bd.getTENBD());
                ps.setString(2, bd.getNGAYSINH());
                ps.setString(3, bd.getCCCD());
                ps.setString(4, bd.getSDT());
                ps.setString(5, bd.getEMAIL());
                ps.setString(6, bd.getNGAYTAO());
                ps.setString(7, bd.getMBD());
                if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Đã cập nhật bạn đọc");
                }else{
                        JOptionPane.showMessageDialog(null, "Không cập nhật được bạn đọc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
        } catch (SQLException ex) {
                System.out.println("Error");
                Logger.getLogger(BandocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteBD(String id){
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
                ps = con.prepareStatement("DELETE FROM BANDOC WHERE MBD = ?");
                ps.setString(1, id);
                if(ps.executeUpdate() != 0){
                        JOptionPane.showMessageDialog(null, "Đã xoá bạn đọc");
                }else{
                        JOptionPane.showMessageDialog(null, "Không thể xoá bạn đọc", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BandocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public void FindBD(String ten){
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
                ps = con.prepareStatement("SELECT * FROM BANDOC WHERE TENBD = ?");
        } catch (SQLException ex) {
                Logger.getLogger(BandocDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
