/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EntradaDAO;
import java.util.List;
import model.Entrada;

/**
 *
 * @author secinfor-04
 */
public class EntradaController {
    
    
    static EntradaController instancia = null;      
     
     public static EntradaController getInstacia(){
       if(  instancia == null){
         return instancia = new EntradaController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public List persistir(Entrada entrada){
       
      EntradaDAO entradaDAO = EntradaDAO.getInstacia();
    
      return entradaDAO.persistir(entrada);
      
         
   }
   public boolean deletar(Entrada entrada){
       
      EntradaDAO entradaDAO = EntradaDAO.getInstacia();
    
      return entradaDAO.deletar(entrada);
      
         
   }  
    
    
    
    
    
}
