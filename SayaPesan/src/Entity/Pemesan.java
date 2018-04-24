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
    int idpemesan;
    String namapemesan;
    
    public String getNama(){
        return namapemesan;
    }
    public int getIdpemesan(){
        return idpemesan;
    }
    public void setNama(String nama){
        this.namapemesan = nama;
        
    }
    public void setId(int id){
        this.idpemesan = id;
    }
    
}
