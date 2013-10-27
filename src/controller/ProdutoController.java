/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import model.Produto;

/**
 *
 * @author secinfor-04
 */
public class ProdutoController {
    
    static ProdutoController instancia = null;      
     
     public static ProdutoController getInstacia(){
       if(  instancia == null){
         return instancia = new ProdutoController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(Produto produto){
       
      ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    
      return produtoDAO.persistir(produto);
      
         
   }
   public boolean deletar(Produto produto){
       
      ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    
      return produtoDAO.deletar(produto);
      
         
   } 
    
    
    
    
    
    
    
}
