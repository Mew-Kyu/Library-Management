/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author nhlon
 */
public class Jdbc {
    private  static Connection con;
    
    public static Connection getConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ThuVien;Username=sa;Password=123");
            
        } catch (Exception e) {
            System.out.println("Kết nối không thành công");
        }
        return con;
    }
    public static String testConnect() {
        try{
            con = Jdbc.getConnect();
            return "Kết nối thành công";
        }
        catch(Exception e) {
            return "Kết nối thất bại";
        }
    } 
}