/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EmpenhoDAO;
import model.Empenho;
import model.Entrada;

/**
 *
 * @author secinfor-04
 */
public class EmpenhoController {
    
   static EmpenhoController instancia = null;      
     
     public static EmpenhoController getInstacia(){
       if(  instancia == null){
         return instancia = new EmpenhoController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(Empenho empenho){
       
      EmpenhoDAO empenhoDAO = EmpenhoDAO.getInstacia();
    
      return empenhoDAO.persistir(empenho);
      
         
   }
   public boolean editaSaldo(Empenho empenho, Entrada entrada){
       
      EmpenhoDAO empenhoDAO = EmpenhoDAO.getInstacia();
    
      return empenhoDAO.editaSaldo(empenho, entrada);
      
         
   }
   public boolean deletar(Empenho empenho){
       
      EmpenhoDAO empenhoDAO = EmpenhoDAO.getInstacia();
    
      return empenhoDAO.deletar(empenho);
      
         
   }  
    
    
    
    
    
    
    
    
    
}
