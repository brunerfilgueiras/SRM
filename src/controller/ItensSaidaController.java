/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ItensSaidaDAO;
import model.ItensSaida;

/**
 *
 * @author secinfor-04
 */
public class ItensSaidaController {
    
    static ItensSaidaController instancia = null;      
     
     public static ItensSaidaController getInstacia(){
       if(  instancia == null){
         return instancia = new ItensSaidaController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(ItensSaida itensSaida){
       
      ItensSaidaDAO itensSaidaDAO = ItensSaidaDAO.getInstacia();
    
      return itensSaidaDAO.persistir(itensSaida);
      
         
   }
   public boolean deletar(ItensSaida itensSaida){
       
      ItensSaidaDAO itensEntradaDAO = ItensSaidaDAO.getInstacia();
    
      return itensEntradaDAO.deletar(itensSaida);
      
         
   }  
    
    
}
