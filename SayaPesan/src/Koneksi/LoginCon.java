/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import Entity.User;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angiospermae
 */
public class LoginCon{
    String sql;
    config koneksi = null;
    public List Login(String username, String password){
        koneksi = new config();
        List<User> data = new ArrayList<>();
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM user WHERE username='"+username+"' AND password='"+password+"'";
            rs = koneksi.getData(sql);
            
            while(rs.next()){
                User ue = new User();
                ue.setId(rs.getInt("idUser"));
                ue.setUsername(rs.getString("username"));
                ue.setPassword(rs.getString("password"));
                ue.setHakAkses(rs.getString("hak_akses"));
                data.add(ue);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Login Gagal");
        }
        return data;
    }
}
