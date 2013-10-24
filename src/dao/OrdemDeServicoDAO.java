/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.OrdemDeServico;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class OrdemDeServicoDAO {
    
    static OrdemDeServicoDAO instancia = null;      
     
     public static OrdemDeServicoDAO getInstacia(){
       if(  instancia == null){
         return instancia = new OrdemDeServicoDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (OrdemDeServico ordemDeServico){
   
        
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(ordemDeServico);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
   
     public List consulta(OrdemDeServico ordemDeServico){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<OrdemDeServico> resultado = new ArrayList<OrdemDeServico>();
        try{ 
        
            Criteria crit = session.createCriteria(OrdemDeServico.class);
            crit.add(Restrictions.ilike("id", ordemDeServico.getId()));
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
    
    public List listaTodas(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<OrdemDeServico> resultado = new ArrayList<OrdemDeServico>();
        try{ 
        
            Criteria crit = session.createCriteria(OrdemDeServico.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(OrdemDeServico ordemDeServico){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(ordemDeServico);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    }
    
    
}
