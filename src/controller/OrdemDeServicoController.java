/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrdemDeServicoDAO;
import model.OrdemDeServico;

/**
 *
 * @author secinfor-04
 */
public class OrdemDeServicoController {
   
    static OrdemDeServicoController instancia = null;      
     
     public static OrdemDeServicoController getInstacia(){
       if(  instancia == null){
         return instancia = new OrdemDeServicoController();
         } else{ 
         return instancia;
       }
     }
    
    
    
   public boolean persistir(OrdemDeServico ordemDeServico){
       
      OrdemDeServicoDAO ordemDeServicoDAO = OrdemDeServicoDAO.getInstacia();
    
      return ordemDeServicoDAO.persistir(ordemDeServico);
         
   }
   
   
   public boolean deletar(OrdemDeServico ordemDeServico){
       
      OrdemDeServicoDAO ordemDeServicoDAO = OrdemDeServicoDAO.getInstacia();
    
      return ordemDeServicoDAO.deletar(ordemDeServico);
      
         
   } 
    
}
