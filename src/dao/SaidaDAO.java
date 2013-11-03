/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Saida;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class SaidaDAO {
  
    static SaidaDAO instancia = null;      
     
     public static SaidaDAO getInstacia(){
       if(  instancia == null){
         return instancia = new SaidaDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    
   
    public List persistir (Saida saida){
   List lista = new ArrayList();
        lista.add(0, false);
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
       saida = em.merge(saida);
        
        em.getTransaction().commit();
        
        
        lista.add(0, true);
        lista.add(1, saida);
        
        return lista;
        
      }catch(Exception e){
       
        
        return lista;
        }
        
    }
    
       
     public Saida consultaId(Saida saida){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Saida.class);
            crit.add(Restrictions.eq("id", saida.getId()));
           
       
          return  (Saida) crit.uniqueResult();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
    
    
    public List listaTodas(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Saida> resultado = new ArrayList<Saida>();
        try{ 
        
            Criteria crit = session.createCriteria(Saida.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(Saida saida){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(saida);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    } 
    
    
    
    
}
