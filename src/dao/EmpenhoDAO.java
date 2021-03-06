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
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class EmpenhoDAO {
    
    
    static EmpenhoDAO instancia = null;      
     
     public static EmpenhoDAO getInstacia(){
       if(  instancia == null){
         return instancia = new EmpenhoDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (Empenho empenho){
   
        
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(empenho);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
   
    public boolean editaSaldo(Empenho empenho, Entrada entrada){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
       EntityManager em = PersistenceUtil.getEntityManager(); 
       Float saldo = empenho.getSaldo();
      try{ 
       saldo = saldo - entrada.getValorTotal();
          empenho.setSaldo(saldo);
          
          em.getTransaction().begin();
           
        em.merge(empenho);
        
        em.getTransaction().commit();         
               
          return true; 
          
        }catch(Exception e){
                   
          
            return  false ;
        }
        
      
    }
     
     public Empenho consultaId(Empenho empenho){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Empenho.class);
            crit.add(Restrictions.eq("id", empenho.getId()));
           
       
          return  (Empenho) crit.uniqueResult();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
     
     
     public List<Empenho> consulta(Empenho empenho){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Empenho.class);
            crit.add(Restrictions.eq("numero", empenho.getNumero()));
           
       
          return   crit.list();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
    
    public List listaTodos(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Empenho> resultado = new ArrayList<Empenho>();
        try{ 
        
            Criteria crit = session.createCriteria(Empenho.class).addOrder(Order.asc("numero"));
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(Empenho produto){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(produto);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    } 

    public boolean existe(Empenho empenho){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Empenho> resultado = new ArrayList<Empenho>();
       
       try{ 
 
            Criteria crit = session.createCriteria(Empenho.class);
            crit.add(Restrictions.ilike("numero", empenho.getNumero()));
            crit.add(Restrictions.ilike("valor", empenho.getValor()));
         return crit.list().isEmpty();
        
         
         }catch(Exception e){
        
          return  true ;
        }
     
   
   }
    
    
    
    
    
}
