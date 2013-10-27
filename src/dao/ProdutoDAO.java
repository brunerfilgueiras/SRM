/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class ProdutoDAO {
   static ProdutoDAO instancia = null;      
     
     public static ProdutoDAO getInstacia(){
       if(  instancia == null){
         return instancia = new ProdutoDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    
    
    public boolean persistir (Produto produto){
   
        
        EntityManager em = PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(produto);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
   
     public List consulta(Produto produto){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Produto> resultado = new ArrayList<Produto>();
        try{ 
        
            if(produto.getDescricao() == null){
                    Criteria crit = session.createCriteria(Produto.class);
                    crit.add(Restrictions.eq("numeroPeca", produto.getNumeroPeca()));
                    resultado = crit.list();
               
               }else{
                        Criteria crit = session.createCriteria(Produto.class);
                        crit.add(Restrictions.ilike("descricao", produto.getDescricao(), MatchMode.ANYWHERE));
                        resultado = crit.list();              
               }
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
     public Produto consultaId(Produto produto){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
      
        try{ 
        
            Criteria crit = session.createCriteria(Produto.class);
            crit.add(Restrictions.eq("id", produto.getId()));
           
       
          return  (Produto) crit.uniqueResult();
        }catch(Exception e){
                   
          return  null ;
          
        }
        
      }
    
    public List listaTodos(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Produto> resultado = new ArrayList<Produto>();
        try{ 
        
            Criteria crit = session.createCriteria(Produto.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
        
       public boolean deletar(Produto produto){
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
}
