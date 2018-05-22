/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import Entity.Menu;
import Entity.orders;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angiospermae
 */
public class PemesananCon {
    String sql;
    config koneksi = null;
    List<Menu> data=new ArrayList<>();
    List<Menu> dataOrder=new ArrayList<>();
    ResultSet rs=null;
    orders or = new orders();
    
    
    public PemesananCon(){
        koneksi = new config();
    }
    
    public List showDataMenu(){
        try {
            sql = "SELECT menu.idMenu, menu.nama_menu, menu.harga_menu, menu.jenis, user.nama_kantin, user.idUser from menu INNER JOIN user on menu.idUser = user.idUser;";
            rs = koneksi.getData(sql);
            while(rs.next()){
                Menu menu = new MenuCon();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setNamaMenu(rs.getString("nama_menu"));
                menu.setHargaMenu(rs.getInt("harga_menu"));
                menu.setJenisMenu(rs.getString("jenis"));
                menu.t.setNamatenat(rs.getString("nama_kantin"));
                menu.t.setIdtenant(rs.getInt("idUser"));
                data.add(menu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return data;
    }
    public List showDataPemesan(int idPemesan){
        try {
            sql = "SELECT idPemesan, namaPemesan,lantai,ruang from pemesan where idPemesan="+idPemesan+";";
            rs = koneksi.getData(sql);
            while(rs.next()){
                Menu menu = new MenuCon();
                menu.p.setIdPemesan(rs.getInt("idPemesan"));
                menu.p.setNama(rs.getString("namaPemesan"));
                menu.p.setLantai(rs.getInt("lantai"));
                menu.p.setRuang(rs.getString("ruang"));
                data.add(menu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return data;
    }
    public List HitungTagihan(int idPemesan){
        try {
           sql = "SELECT "
                    + "SUM(harga_menu) as tagihan "
                    + "FROM orders "
                    + "INNER JOIN pemesan "
                    + "on pemesan.idPemesan = orders.idPemesan "
                    + "INNER JOIN menu "
                    + "on menu.idMenu = orders.idMenu "
                    + "INNER JOIN user "
                    + "on user.idUser = orders.idUser "
                    + "where pemesan.idPemesan="+idPemesan+";";
         //   System.out.println(sql);
            rs = koneksi.getData(sql);
            while(rs.next()){
                Menu menu = new MenuCon();
                menu.p.settagihan(rs.getInt("tagihan"));
                data.add(menu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return data;
    }
    public List showDataOrder(int idPemesan){
        try {
            sql = "SELECT "
                    + "orders.idOrder, menu.idMenu, menu.nama_menu, menu.harga_menu, menu.jenis, user.nama_kantin, user.idUser "
                    + "FROM orders "
                    + "INNER JOIN pemesan "
                    + "on pemesan.idPemesan = orders.idPemesan "
                    + "INNER JOIN menu "
                    + "on menu.idMenu = orders.idMenu "
                    + "INNER JOIN user "
                    + "on user.idUser = orders.idUser "
                    + "where pemesan.idPemesan="+idPemesan+";";
            System.out.println(sql);
            rs = koneksi.getData(sql);
            while(rs.next()){
                Menu menu = new MenuCon();
                menu.O.setIdOrder(rs.getInt("idOrder"));
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setNamaMenu(rs.getString("nama_menu"));
                menu.setHargaMenu(rs.getInt("harga_menu"));
                menu.setJenisMenu(rs.getString("jenis"));
                menu.t.setNamatenat(rs.getString("nama_kantin"));
                menu.t.setIdtenant(rs.getInt("idUser"));
                dataOrder.add(menu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return dataOrder;
    }
    public void addDataOrder(int idPemesan, int idMenu, int idKantin){
            sql = "INSERT INTO orders (idPemesan, idMenu, idUser) VALUES ("+idPemesan+","+idMenu+","+idKantin+");";
            //System.out.println(sql);
            koneksi.saveData(sql); 
    }
    
    
    public void deleteData(int idPemesan, int idMenu, int idKantin){
        sql = "DELETE FROM orders WHERE idPemesan="+idPemesan+" AND idMenu="+idMenu+" AND idUser="+idKantin+";";
        System.out.println(sql);
        koneksi.saveData(sql);
    }
     public void deleteData(int idOrder){
        sql = "DELETE FROM orders WHERE idOrder="+idOrder+";";
        System.out.println(sql);
        koneksi.saveData(sql);
    }
    public static void main(String[] args) {
        PemesananCon n = new PemesananCon();
        n.HitungTagihan(2);
    }
}
