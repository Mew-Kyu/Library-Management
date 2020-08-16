/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Helper.Jdbc;
import Model.Thuthu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ThuthuDAO {

    //List User
    public ArrayList<Thuthu> memberList() throws SQLException, ClassNotFoundException {
        ArrayList<Thuthu> list = new ArrayList<>();
        Connection con = Jdbc.getConnection();
        Statement st;
        ResultSet rs;

        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM `THUTHU`");
            Thuthu thuthu;

            while (rs.next()) {
                thuthu = new Thuthu(
                        rs.getString("ACC"),
                        rs.getString("PASS"));

                list.add(thuthu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThuthuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
