/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.MontadoraDAO;
import model.Montadora;

/**
 *
 * @author secinfor-04
 */
public class MontadoraController {
    
    static MontadoraController instancia = null;      
    private MontadoraDAO montadoraDAO = MontadoraDAO.getInstacia(); 
    
    
    
    
    public static MontadoraController getInstacia(){
       if(  instancia == null){
         return instancia = new MontadoraController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(Montadora montadora){
       
     
    
      return montadoraDAO.persistir(montadora);
      
         
   }
   public boolean deletar(Montadora montadora){
       
     
    
      return montadoraDAO.deletar(montadora);
      
         
   } 
  
  
  public boolean existe(Montadora montadora){
      
        return montadoraDAO.existe(montadora);
     
    }  
   
   
   
   
   
   
}
