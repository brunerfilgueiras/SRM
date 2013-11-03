/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SaidaDAO;
import java.util.List;
import model.Saida;

/**
 *
 * @author secinfor-04
 */
public class SaidaController {
    static SaidaController instancia = null;      
     
     public static SaidaController getInstacia(){
       if(  instancia == null){
         return instancia = new SaidaController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public List persistir(Saida saida){
       
      SaidaDAO saidaDAO = SaidaDAO.getInstacia();
    
      return saidaDAO.persistir(saida);
      
         
   }
   public boolean deletar(Saida saida){
       
      SaidaDAO saidaDAO = SaidaDAO.getInstacia();
    
      return saidaDAO.deletar(saida);
      
         
   }  
}
