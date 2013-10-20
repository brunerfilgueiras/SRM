/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FornecedorDAO;
import model.Fornecedor;

/**
 *
 * @author secinfor-04
 */
public class FornecedorController {
    static FornecedorController instancia = null;      
     
     public static FornecedorController getInstacia(){
       if(  instancia == null){
         return instancia = new FornecedorController();
         } else{ 
         return instancia;
       }
     }  
    
    public boolean persistir(Fornecedor fornecedor){
       
      FornecedorDAO fornecedorDAO = FornecedorDAO.getInstacia();
    
      return fornecedorDAO.persistir(fornecedor);
      
         
   }
  
 
   public boolean deletar(Fornecedor fornecedor){
       
      FornecedorDAO fornecedorDAO = FornecedorDAO.getInstacia();
    
      return fornecedorDAO.deletar(fornecedor);
    
   }
}
