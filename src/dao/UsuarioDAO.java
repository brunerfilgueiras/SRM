/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.PersistenceUtil;

/**
 *
 * @author secinfor-04
 */
public class UsuarioDAO {
   
    static UsuarioDAO instancia = null;      
     
     public static UsuarioDAO getInstacia(){
       if(  instancia == null){
         return instancia = new UsuarioDAO();
         } else{ 
         return instancia;
       }
     }
    
    
    public boolean persistir (Usuario usuario){
   
        
        EntityManager em =  PersistenceUtil.getEntityManager();
    try{
        em.getTransaction().begin();
           
        em.merge(usuario);
        
        em.getTransaction().commit();
        
        return true;
        
      }catch(Exception e){
       
        
        return false;
        }
        
    }
    
    
    public boolean deletar(Usuario usuario){
         EntityManager em = PersistenceUtil.getEntityManager();
         try{
             em.getTransaction().begin();
             em.remove(usuario);
             em.getTransaction().commit();
             return true;
         }catch(Exception e){
             em.getTransaction().rollback();
             return false;
         }
        
                    
    }
    
    
    
    public List consulta(Usuario usuario){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Usuario> resultado = new ArrayList<Usuario>();
        try{ 
 
           if(usuario.getLogin() != null){
            Criteria crit = session.createCriteria(Usuario.class);
            crit.add(Restrictions.ilike("login", usuario.getLogin(), MatchMode.ANYWHERE));
            resultado = crit.list();
           }else{
              if(usuario.getNomeCompleto() != null){
                    Criteria crit = session.createCriteria(Usuario.class);
                    crit.add(Restrictions.ilike("nomeCompleto", usuario.getNomeCompleto(), MatchMode.ANYWHERE));
                    resultado = crit.list();
               
               }else{
                        Criteria crit = session.createCriteria(Usuario.class);
                        crit.add(Restrictions.ilike("nomeGuerra", usuario.getNomeGuerra(), MatchMode.ANYWHERE));
                        resultado = crit.list();
                   
               }
           }
           
           
           
           
           
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
    
    
    
    public Usuario login(Usuario usuario){
       EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate(); 
     List<Usuario> resultado = new ArrayList<Usuario>();
       
      
       Criteria crit = session.createCriteria(Usuario.class);
      crit.add(Restrictions.ilike("login", usuario.getLogin()));
      crit.add(Restrictions.ilike("senha", usuario.getSenha()));
      resultado =  crit.list();   
        
    if(resultado == null) {   
       return resultado.get(0); 
    }else{
       return resultado.get(0);  
    }   
        
        
        
       
    }
    
    
    
    
    public List listaTodos(){
        
        EntityManager entityManager = PersistenceUtil.getEntityManager();
       Session session = (Session) entityManager.getDelegate();
        
       List<Usuario> resultado = new ArrayList<Usuario>();
        try{ 
        
            Criteria crit = session.createCriteria(Usuario.class);
            resultado = crit.list();
       
          return resultado; 
        }catch(Exception e){
                   
          resultado = null;
            return  resultado ;
        }
        
      }   
    
    
    
    
    
    
    
    
    
    
    
    
}
