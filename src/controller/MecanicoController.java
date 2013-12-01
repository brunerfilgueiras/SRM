/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MecanicoDAO;
import model.Mecanico;

/**
 *
 * @author secinfor-04
 */
public class MecanicoController {
  
    static MecanicoController instancia = null;      
    MecanicoDAO mecanicoDAO = MecanicoDAO.getInstacia();
    
     public static MecanicoController getInstacia(){
       if(  instancia == null){
         return instancia = new MecanicoController();
         } else{ 
         return instancia;
       }
     }  
    
    public boolean persistir(Mecanico mecanico){
       
      
    
      return mecanicoDAO.persistir(mecanico);
      
         
   }
  
 
   public boolean deletar(Mecanico mecanico){
       
      
    
      return mecanicoDAO.deletar(mecanico);
    
   }
    
    public boolean existe(Mecanico mecanico){
      
        return mecanicoDAO.existe(mecanico);
     
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
