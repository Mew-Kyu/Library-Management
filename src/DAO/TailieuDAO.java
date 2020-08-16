/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.Jdbc;
import Model.Tailieu;
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
public class TailieuDAO {
    public void insertPT(Tailieu tl) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("INSERT INTO TAILIEU VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, tl.getMTL());
            ps.setString(2, tl.getTENTL());
            ps.setString(3, tl.getLOAI());
            ps.setString(4, tl.getNGUON());
            ps.setString(5, tl.getVITRI());
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã nhập tài liệu mới");
            } else {
                JOptionPane.showMessageDialog(null, "Không thêm được phiếu mới", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            Logger.getLogger(TailieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTL(Tailieu tl) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        String sql = "UPDATE TAILIEU SET TENTL= ?, LOAI= ?, NGUON= ?, VITRI = ? WHERE MTL = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tl.getTENTL());
            ps.setString(2, tl.getLOAI());
            ps.setString(3, tl.getNGUON());
            ps.setString(4, tl.getVITRI());
            ps.setString(5, tl.getMTL());
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã cập nhật tài liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Không cập nhật được tài liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Error");
            Logger.getLogger(TailieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteTL(String id) {
        Connection con = Jdbc.getConnect();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("DELETE FROM TAILIEU WHERE MTL = ?");
            ps.setString(1, id);
            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Đã xoá tài liệu");
            } else {
                JOptionPane.showMessageDialog(null, "Không thể xoá tài liệu", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TailieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void FindTL(String ten) {
        Connection con = Jdbc.getConnect();
        ResultSet rs;
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM TAILIEU WHERE TENTL = ?");
            ps.setString(1, ten);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                MainFrameUI.txtMatailieu.setText(rs.getString("MTL"));
                MainFrameUI.txtTentailieu.setText(rs.getString("TENTL"));
                MainFrameUI.txtLoai.setText(rs.getString("LOAI"));
                MainFrameUI.txtNguon.setText(rs.getString("NGUON"));
                MainFrameUI.txtVitri.setText(rs.getString("VITRI"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Khong tim thay du lieu !","Thong bao",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TailieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Tailieu> TailieuList() {
        ArrayList<Tailieu> list = new ArrayList<>();
        Connection con = Jdbc.getConnect();

        try {
            ResultSet rs;
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM TAILIEU");
            rs = ps.executeQuery();

            Tailieu tailieu;

            while (rs.next()) {
                tailieu = new Tailieu(
                        rs.getString("MTL"),
                        rs.getString("TENTL"),
                        rs.getString("LOAI"),
                        rs.getString("NGUON"),
                        rs.getString("VITRI"));

                list.add(tailieu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TailieuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
