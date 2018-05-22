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
public class orders {
    int idOrder;
   public Pemesan p = new Pemesan();
   public Menu m = new Menu();
   public Tenant t = new Tenant();
   // Tenant t = new Tenant();
    
    public void setIdOrder(int idOrder){
        this.idOrder = idOrder;
    }
    public int getidOrder(){
        return idOrder;
    }
    /*
    public void setidp(int test){
        this.p.idpemesan = test;
    }
    public int getidp(){
        return p.idpemesan;
    }
    public void setNPemilik(String nP){
        this.t.NamaPemilik = nP;
    }
    public String getNPemilik(){
        return t.NamaPemilik;
    }
*/
}
