/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import Entity.Menu;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angiospermae
 */
public class MenuCon extends Menu{
    String sql;
    config koneksi = null;
    List<Menu> data=new ArrayList<>();
    ResultSet rs=null;
    
    public MenuCon(){
        koneksi = new config();
    }
    public void addData(int idkantin){
            sql = "INSERT INTO menu (nama_menu, harga_menu, jenis, idUser) VALUES ('"+super.getNamaMenu()+"','"+super.getHargaMenu()+"','"+super.getJenisMenu()+"','"+idkantin+"');";
            //System.out.println(sql);
            koneksi.saveData(sql); 
    }
    public void updateData(int cari ){
        sql = "UPDATE menu SET "
                   
                     + "nama_menu='"+super.getNamaMenu()+"',"
                     + "harga_menu="+super.getHargaMenu()+","
                     + "jenis='"+super.getJenisMenu()+"' "
                     + " where "
                     + "idmenu="+cari+";"; 
        System.out.println(sql);
        koneksi.saveData(sql);
    }
    public void deleteData(int cari){
        sql = sql = "DELETE FROM menu WHERE "
                    + "idmenu="+cari+";";
        koneksi.saveData(sql);
    }
    public List showData(int idUser){
        try {
            sql = "SELECT * FROM menu where idUser="+idUser+";";
            rs = koneksi.getData(sql);
            while(rs.next()){
                Menu menu = new MenuCon();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setNamaMenu(rs.getString("nama_menu"));
                menu.setHargaMenu(rs.getInt("harga_menu"));
                menu.setJenisMenu(rs.getString("jenis"));
                data.add(menu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return data;
    }
    
   
}
