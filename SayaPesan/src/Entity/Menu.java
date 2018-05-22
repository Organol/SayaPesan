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
public class Menu {
    public int idmenu;
    String namamenu, jenismenu;
    int hargamenu;
    int idtenant;
    static public Tenant t = new Tenant();
    static public orders O = new orders();
    static public Pemesan p = new Pemesan();
   
   public void setIdMenu(int id){
       this.idmenu = id;
   }
   public int getidmenu(){
       return idmenu;
   }
   public void setNamaMenu(String namamenu){
       this.namamenu= namamenu;
   }
   public String getNamaMenu(){
       return namamenu;
   }
   public void setJenisMenu(String jenismenu){
       this.jenismenu = jenismenu;
   }
   public String getJenisMenu(){
       return jenismenu;
   }
   public void setHargaMenu(int harga){
       this.hargamenu = harga;
   }
   public int getHargaMenu(){
       return hargamenu;
   }
   /*
    public void setNTenant(String NTenant){
       this.NTenant = NTenant;
   }
   public String getNTenant(){
       return NTenant;
   }
   
   public void setIdOr(int idOrder){
        this.or.idOrder = idOrder;
    }
    public int getidOr(){
        return or.idOrder;
    }
*/
    public void printinfo(){
//        System.out.println("Id Tenant: "+getidTenant());
        //System.out.println(idmenu+"-"+namamenu+"-"+jenismenu+"-"+hargamenu);
    }
    
    public static void main(String[] args) {
       Menu menu  = new Menu();
       menu.printinfo();
    }

    
    
    
}
