/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Angiospermae
 */
public class config {
    public Connection con;
    public Statement stmt;
    public ResultSet rss;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sayapesan", "root", "");
            stmt = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal " +e.getMessage());
        }
    }
    public ResultSet getData(String sql){
        try {
            config();
            rss=stmt.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ambil data Gagal");
        }
        return rss;
    }
    
    public void saveData(String sql){
        try {
            config();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Simpan data Gagal"+e);
        } 
        
    }
}
