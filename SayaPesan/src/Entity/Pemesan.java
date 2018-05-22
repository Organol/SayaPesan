/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Angiospermae
 */
public class Pemesan {
    int idpemesan,lantai,tagihan;
    String namapemesan,ruang;
    
    public int getTagihan(){
        return tagihan;
    }
    public void settagihan(int tagihan){
        this.tagihan =tagihan;
    }
    public String getNama(){
        return namapemesan;
    }
    public void setNama(String nama){
        this.namapemesan = nama;
    }
    public int getIdpemesan(){
        return idpemesan;
    }
    public void setIdPemesan(int idPemesan){
        this.idpemesan = idPemesan;
    }
    public int getLantai(){
        return lantai;
    }
    public void setLantai(int lantai){
        this.lantai = lantai;
    }
    public String getRuang(){
        return ruang;
    }
    public void setRuang(String ruang){
        this.ruang = ruang;
    }
}
