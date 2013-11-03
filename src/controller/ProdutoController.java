/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import model.ItensEntrada;
import model.ItensSaida;
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
   public boolean editaQuantidade(ItensSaida itensSaida){
       
      ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    
      return produtoDAO.editaQuantidade(itensSaida);
      
         
   }
   public boolean editaQuantidade(ItensEntrada itensEntrada){
       
      ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    
      return produtoDAO.editaQuantidade(itensEntrada);
      
         
   }
   public boolean deletar(Produto produto){
       
      ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    
      return produtoDAO.deletar(produto);
      
         
   } 
    
    
    
    
    
    
    
}
