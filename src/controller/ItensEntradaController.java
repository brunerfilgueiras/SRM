/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ItensEntradaDAO;
import model.ItensEntrada;

/**
 *
 * @author secinfor-04
 */
public class ItensEntradaController {
    static ItensEntradaController instancia = null;      
     
     public static ItensEntradaController getInstacia(){
       if(  instancia == null){
         return instancia = new ItensEntradaController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(ItensEntrada itensEntrada){
       
      ItensEntradaDAO itensEntradaDAO = ItensEntradaDAO.getInstacia();
    
      return itensEntradaDAO.persistir(itensEntrada);
      
         
   }
   public boolean deletar(ItensEntrada itensEntrada){
       
      ItensEntradaDAO itensEntradaDAO = ItensEntradaDAO.getInstacia();
    
      return itensEntradaDAO.deletar(itensEntrada);
      
         
   }  
}
