/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Entrada;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class EntradaDAO {
    static EntradaDAO instancia = null;      
     
     public static EntradaDAO getInstacia(){
       if(  instancia == null){
         return instancia = new EntradaDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    
   
    public List persistir (Entrada entrada){
   List lista = new ArrayList();
        lista.add(0, false);
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
       entrada = em.merge(entrada);
        
        em.getTransaction().commit();
        
        
        lista.add(0, true);
        lista.add(1, entrada);
        
        return lista;
        
      }catch(Exception e){
       
        
        return lista;
        }
        
    }
    
       
     public Entrada consultaId(Entrada entrada){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Entrada.class);
            crit.add(Restrictions.eq("id", entrada.getId()));
           
       
          return  (Entrada) crit.uniqueResult();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
    
    
    public List listaTodas(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Entrada> resultado = new ArrayList<Entrada>();
        try{ 
        
            Criteria crit = session.createCriteria(Entrada.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(Entrada entrada){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(entrada);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    } 
    
    
    
}
