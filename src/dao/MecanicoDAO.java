/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Mecanico;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class MecanicoDAO {
    static MecanicoDAO instancia = null;      
     
     public static MecanicoDAO getInstacia(){
       if(  instancia == null){
         return instancia = new MecanicoDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    public boolean persistir (Mecanico mecanico){
   
        
        EntityManager em =  PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(mecanico);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
    
    
    public boolean deletar(Mecanico mecanico){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(mecanico);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    }
    
    
    
    public List consulta(Mecanico mecanico){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Mecanico> resultado = new ArrayList<Mecanico>();
        try{ 
 
           
              if(mecanico.getNomeCompleto() != null){
                    Criteria crit = session.createCriteria(Mecanico.class);
                    crit.add(Restrictions.ilike("nomeCompleto", mecanico.getNomeCompleto(), MatchMode.ANYWHERE));
                    resultado = crit.list();
               
               }else{
                        Criteria crit = session.createCriteria(Mecanico.class);
                        crit.add(Restrictions.ilike("nomeGuerra", mecanico.getNomeGuerra(), MatchMode.ANYWHERE));
                        resultado = crit.list();
                   
               }
           
    
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
    
   
    
    public List listaTodos(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Mecanico> resultado = new ArrayList<Mecanico>();
        try{ 
        
            Criteria crit = session.createCriteria(Mecanico.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
}
