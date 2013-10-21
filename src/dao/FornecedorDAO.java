/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Fornecedor;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class FornecedorDAO {
    
   static FornecedorDAO instancia = null;      
     
     public static FornecedorDAO getInstacia(){
       if(  instancia == null){
         return instancia = new FornecedorDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    public boolean persistir (Fornecedor fornecedor){
   
        
        EntityManager em =  PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(fornecedor);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
    
    
    public boolean deletar(Fornecedor fornecedor){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(fornecedor);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    }
    
    
    
    public List consulta(Fornecedor fornecedor){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Fornecedor> resultado = new ArrayList<Fornecedor>();
        try{ 
 
           
              if(fornecedor.getNome() != null){
                    Criteria crit = session.createCriteria(Fornecedor.class);
                    crit.add(Restrictions.ilike("nome", fornecedor.getNome(), MatchMode.ANYWHERE));
                    resultado = crit.list();
               
               }else{
                        Criteria crit = session.createCriteria(Fornecedor.class);
                        crit.add(Restrictions.ilike("cnpj", fornecedor.getCnpj(), MatchMode.ANYWHERE));
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
        
       List<Fornecedor> resultado = new ArrayList<Fornecedor>();
        try{ 
        
            Criteria crit = session.createCriteria(Fornecedor.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
