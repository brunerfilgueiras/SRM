/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.ItensEntrada;
import model.ItensSaida;
import model.Produto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
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
   
        public boolean editaQuantidade(ItensEntrada itensEntrada){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       Produto resultado = new Produto();
      EntityManager em = PersistenceUtil.getEntityManager();
       try{ 
        
            
                    Criteria crit = session.createCriteria(Produto.class);
                    crit.add(Restrictions.eq("id", itensEntrada.getIdProduto().getId()));
                    resultado = (Produto) crit.uniqueResult();
               
        int qtd = itensEntrada.getQuantidade();
        
         qtd= qtd + itensEntrada.getQuantidade();
                    
          resultado.setQuantidade(qtd);
          
           em.getTransaction().begin();
           
        em.merge(resultado);
        
        em.getTransaction().commit();         
                    
                    
                    
          return true; 
        }catch(Exception e){
                   
          
            return  false ;
        }
        
      }
    
    
    
    public boolean editaQuantidade(ItensSaida itensSaida){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       Produto resultado = new Produto();
      EntityManager em = PersistenceUtil.getEntityManager();
       try{ 
        
            
                    Criteria crit = session.createCriteria(Produto.class);
                    crit.add(Restrictions.eq("id", itensSaida.getIdProduto().getId()));
                    resultado = (Produto) crit.uniqueResult();
               
        int qtd = itensSaida.getQuantidade();
        
         qtd= qtd - itensSaida.getQuantidade();
                    
          resultado.setQuantidade(qtd);
          
           em.getTransaction().begin();
           
        em.merge(resultado);
        
        em.getTransaction().commit();         
                    
                    
                    
          return true; 
        }catch(Exception e){
                   
          
            return  false ;
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
        
            Criteria crit = session.createCriteria(Produto.class).addOrder(Order.asc("descricao"));
            
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
       
   public boolean existe(Produto produto){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Produto> resultado = new ArrayList<Produto>();
       
       try{ 
 
          
            Criteria crit = session.createCriteria(Produto.class);
            crit.add(Restrictions.ilike("descricao", produto.getDescricao()));
            crit.add(Restrictions.ilike("numeroPeca", produto.getNumeroPeca()));
            return crit.list().isEmpty();
        
         
         }catch(Exception e){
        
          return  true ;
        }
     
   
   }
       
       
       
}
