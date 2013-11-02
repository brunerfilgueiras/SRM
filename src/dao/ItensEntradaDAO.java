/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Empenho;
import model.Entrada;
import model.ItensEntrada;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class ItensEntradaDAO {
    
    static ItensEntradaDAO instancia = null;      
     
     public static ItensEntradaDAO getInstacia(){
       if(  instancia == null){
         return instancia = new ItensEntradaDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (ItensEntrada itensEntrada){
   
        
   
       EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(itensEntrada);
        
        em.getTransaction().commit();
        
        return  true;
        
      }catch(Exception e){
       
        
       return false;
        }
      
   
    }
   
     
     public List<ItensEntrada> consulta(Entrada entrada){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(ItensEntrada.class);
            crit.add(Restrictions.eq("idEntrada", entrada.getId()));
           
       
          return  crit.list();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
        
    
        
       public boolean deletar(ItensEntrada itensEntrada){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(itensEntrada);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    } 
    
    
    
}
