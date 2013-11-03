/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.ItensSaida;
import model.Saida;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class ItensSaidaDAO {
   
    static ItensSaidaDAO instancia = null;      
     
     public static ItensSaidaDAO getInstacia(){
       if(  instancia == null){
         return instancia = new ItensSaidaDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (ItensSaida itensSaida){
   
        
   
       EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(itensSaida);
        
        em.getTransaction().commit();
        
        return  true;
        
      }catch(Exception e){
       
        
       return false;
        }
      
   
    }
   
     
     public List<ItensSaida> consulta(Saida saida){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Saida.class);
            crit.add(Restrictions.eq("idEntrada", saida.getId()));
           
       
          return  crit.list();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
        
    
        
       public boolean deletar(ItensSaida itensSaida){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(itensSaida);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    } 
    
}
