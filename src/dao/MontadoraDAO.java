/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Montadora;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class MontadoraDAO {
    
    static MontadoraDAO instancia = null;      
     
     public static MontadoraDAO getInstacia(){
       if(  instancia == null){
         return instancia = new MontadoraDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (Montadora montadora){
   
        
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(montadora);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
   
     public List consulta(Montadora montadora){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Montadora> resultado = new ArrayList<Montadora>();
        try{ 
        
            Criteria crit = session.createCriteria(Montadora.class);
            crit.add(Restrictions.ilike("nome", montadora.getNome(), MatchMode.ANYWHERE));
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
    
     public Montadora consultaId(Montadora montadora){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Montadora.class);
            crit.add(Restrictions.eq("id", montadora.getId()));
           
       
          return  (Montadora) crit.uniqueResult();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
     
     
     
    public List listaTodas(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Montadora> resultado = new ArrayList<Montadora>();
        try{ 
        
            Criteria crit = session.createCriteria(Montadora.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(Montadora montadora){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(montadora);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    }
    
    
    
    
    
    
    
    
}  
    
        
   
