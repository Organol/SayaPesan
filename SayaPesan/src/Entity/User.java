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
public class User {
    public int idUser;
    public String Username, HakAkses;
    public String Password;
    
    public String getPassword(){
        return Password;
    }
    public void setPassword(String password){
        this.Password = password;
    }
    public int getId(){
        return idUser;
    }
    public void setId(int idUser){
        this.idUser = idUser;
    }
    public String getHak(){
        return HakAkses;
    }
    public void setHakAkses(String hak){
        this.HakAkses = hak;
    }
    public String getUsername(){
        return Username;
    }
    public void setUsername(String Username){
        this.Username = Username;
    }
}
