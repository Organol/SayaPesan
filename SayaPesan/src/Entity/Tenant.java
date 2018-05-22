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
public class Tenant {
    String namatenant,NamaPemilik;
    int idtenant;
     
    public void setIdtenant(int idtenant){
        this.idtenant = idtenant;
    }
    public int getidTenant(){
        return idtenant;
    }
     public void setNamaPemilik(String NamaPemilik){
        this.NamaPemilik = NamaPemilik;
    }
    public String getNamaPemilik(){
        return NamaPemilik;
    }
    public void setNamatenat(String namatenant){
        this.namatenant = namatenant;
    }
    public String getNamaTenant(){
        return namatenant;
    }
    
}
