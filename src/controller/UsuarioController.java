/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDAO;
import model.Usuario;

/**
 *
 * @author secinfor-04
 */
public class UsuarioController {
  
    
    
    static UsuarioController instancia = null;      
     
     public static UsuarioController getInstacia(){
       if(  instancia == null){
         return instancia = new UsuarioController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(Usuario usuario){
       
      UsuarioDAO usuarioDAO = UsuarioDAO.getInstacia();
    
      return usuarioDAO.persistir(usuario);
      
         
   }
  
 
   public boolean deletar(Usuario usuario){
       
      UsuarioDAO usuarioDAO = UsuarioDAO.getInstacia();
    
      return usuarioDAO.deletar(usuario);
    
   }
    
   
    public boolean existir(Usuario usuario){
        
        
        UsuarioDAO usuarioDAO = UsuarioDAO.getInstacia();
        
        if(usuarioDAO.existe(usuario).isEmpty()){
           return true;  
        }else{
          return false;   
        }
        
        
       
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
