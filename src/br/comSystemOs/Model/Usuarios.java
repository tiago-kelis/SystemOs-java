/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.comSystemOs.Model;

/**
 *
 * @author tiago
 */
public class Usuarios {
    
    private int iduser;
    private String usuario;
    private String fone;
    private String login;
    private String senha;
    
     public int getIduser(){
            return iduser;
        }
     
     public void setIuser(int iduser){
         this.iduser = iduser;
     }
     
     public String getUsuario(){
         return usuario;
     }
     
     public void setUsuario(String usuario){
         this.usuario = usuario;
     }
     
     public String getFone(){
         return fone;
     }
     
     public void setFone(String fone){
         this.fone = fone;
     }
     
     public String getLogin(){
         return login;
     }
     
     public void setLogin(String login){
         this.login = login;
     }
     
     public String getSenha(){
         return senha;
     }
     
     public void setSenha(String senha){
         this.senha = senha;
     }
    
    public Usuarios(int iduser, String usuario, String fone, String login, String senha){
        
      this.iduser = iduser;
      this.usuario = usuario;
      this.fone = fone;
      this.login = login;
      this.senha = senha;
    }
        
   
    
}
