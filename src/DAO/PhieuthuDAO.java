/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.Jdbc;
import Model.Phieuthu;
import Model.Phieuthu;
import UI.MainFrameUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class PhieuthuDAO {
    public void insertPT(Phieuthu pt) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO PHIEUTHU VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, pt.getMHD());
            ps.setString(2, pt.getMBD());
            ps.setString(3, pt.getMTL());
            ps.setString(4, pt.getNGAYMUON());
            ps.setString(5, pt.getHOANTRA());
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã nhập phiếu thu mới");
            } else {
                JOptionPane.showMessageDialog(null, "Không thêm được phiếu mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            Logger.getLogger(PhieuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePT(Phieuthu pt) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        String sql = "UPDATE PHIEUTHU SET MBD= ?, MTL= ?, NGAYMUON= ?, HOANTRA = ? WHERE MHD = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pt.getMBD());
            ps.setString(2, pt.getMTL());
            ps.setString(3, pt.getNGAYMUON());
            ps.setString(4, pt.getHOANTRA());
            ps.setString(5, pt.getMHD());
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã cập nhật phiếu thu");
            } else {
                JOptionPane.showMessageDialog(null, "Không cập nhật được phiếu thu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            Logger.getLogger(PhieuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletePT(String id) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM PHIEUTHU WHERE MHD = ?");
            ps.setString(1, id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã xoá phiếu thu");
            } else {
                JOptionPane.showMessageDialog(null, "Không thể xoá phiếu thu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void FindPT(String ten) {
        Connection con = Jdbc.getConnect();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM PHIEUTHU WHERE MHD = ?");
            ps.setString(1, ten);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                MainFrameUI.txtMahoadon.setText(rs.getString("MHD"));
                MainFrameUI.txtMBD.setText(rs.getString("MBD"));
                MainFrameUI.txtMTL.setText(rs.getString("MTL"));
                MainFrameUI.txtNgaymuon.setText(rs.getString("NGAYMUON"));
                MainFrameUI.txtHoantra.setText(rs.getString("HOANTRA"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Khong tim thay du lieu !","Thong bao",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PhieuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Phieuthu> PhieuthuList() {
        ArrayList<Phieuthu> list = new ArrayList<>();
        Connection con = Jdbc.getConnect();

        try {
            ResultSet rs;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM PHIEUTHU");
            rs = ps.executeQuery();
            Phieuthu phieuthu;

            while (rs.next()) {
                phieuthu = new Phieuthu(
                        rs.getString("MHD"),
                        rs.getString("MBD"),
                        rs.getString("MTL"),
                        rs.getString("NGAYMUON"),
                        rs.getString("HOANTRA"));
                list.add(phieuthu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhieuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
