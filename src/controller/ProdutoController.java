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
    private ProdutoDAO produtoDAO = ProdutoDAO.getInstacia();
    static ProdutoController instancia = null;      
     
     public static ProdutoController getInstacia(){
       if(  instancia == null){
         return instancia = new ProdutoController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(Produto produto){
       
     
    
      return produtoDAO.persistir(produto);
      
         
   }
   public boolean editaQuantidade(ItensSaida itensSaida){
       
      
    
      return produtoDAO.editaQuantidade(itensSaida);
      
         
   }
   public boolean editaQuantidade(ItensEntrada itensEntrada){
       
      
    
      return produtoDAO.editaQuantidade(itensEntrada);
      
         
   }
   public boolean deletar(Produto produto){
       
      
    
      return produtoDAO.deletar(produto);
      
         
   } 
    
    public boolean existir(Produto produto){
      
        return produtoDAO.existe(produto);
     
    }
    
    
}
