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
    int idmenu;
    String namamenu;
    String jenismenu;
    
    public int setIdmenu(){
        return idmenu;
    }
    public String setNamamenu(){
        return namamenu;
    }
    public String setJenismenu(){
        return jenismenu;
    }
    public void getIdmenu(int idmenu){
        this.idmenu = idmenu;
    }
    public void getNamamenu(String namamenu){
        this.namamenu = namamenu;
    }
    public void getJenismenu(String jenismenu){
        this.jenismenu = jenismenu;
    }
}
