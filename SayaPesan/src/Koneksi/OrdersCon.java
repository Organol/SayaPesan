/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import Entity.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angiospermae
 */
public class OrdersCon extends orders{
     String sql;
     config koneksi = null;
     ResultSet rs = null;
    
     List<orders> data=new ArrayList<>();
     List<orders> dataTenant =new ArrayList<>();
     
     public OrdersCon(){
         koneksi = new config();
     }
     
      public List showData(int idKantin){
        try {
            sql = "SELECT * FROM orders where idUser="+idKantin+";";
            rs = koneksi.getData(sql);
            while(rs.next()){
                orders order = new OrdersCon();
                order.setIdOrder(rs.getInt("idOrder"));
                order.p.setIdPemesan(rs.getInt("idPemesan"));
                order.m.setIdMenu(rs.getInt("idMenu"));
                data.add(order);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data failed"+e);
        }
        return data;
    }
      public List OrderDetails(int idPemesan){
        try {
            sql = "SELECT orders.idMenu, menu.nama_menu FROM orders INNER JOIN menu on menu.idMenu = orders.idMenu where orders.idPemesan="+idPemesan+";";
            System.out.println(sql);
            rs = koneksi.getData(sql);
            while(rs.next()){
                orders ordera = new OrdersCon();
                ordera.m.setIdMenu(rs.getInt("idMenu"));
                ordera.m.setNamaMenu(rs.getString("nama_menu"));
                dataTenant.add(ordera);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data Order failed"+e);
        }
        return dataTenant;
    }
      public List DetailsKantin(int idUser){
        try {
            sql = "SELECT nama_kantin, nama_pemilik FROM user where idUser="+idUser+";";
            System.out.println(sql);
            rs = koneksi.getData(sql);
            while(rs.next()){
                orders Tenant = new OrdersCon();
                Tenant.t.setNamatenat(rs.getString("nama_kantin"));
                Tenant.t.setNamaPemilik(rs.getString("nama_pemilik"));
                data.add(Tenant);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data Tenant failed"+e);
        }
        return data;
    }
      public List DetailsPemesan(int idPemesan){
        try {
            sql = "SELECT namaPemesan, lantai, ruang from pemesan where idPemesan="+idPemesan+";";
            System.out.println(sql);
            rs = koneksi.getData(sql);
            while(rs.next()){
                orders Tenant = new OrdersCon();
                Tenant.p.setNama(rs.getString("namaPemesan"));
                Tenant.p.setLantai(rs.getInt("lantai"));
                Tenant.p.setRuang(rs.getString("ruang"));
                data.add(Tenant);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"get data Pemesan failed"+e);
        }
        return data;
    }
   
}
