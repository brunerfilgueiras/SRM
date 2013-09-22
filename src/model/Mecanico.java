package model;
// Generated 22/09/2013 15:07:10 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Mecanico generated by hbm2java
 */
public class Mecanico  implements java.io.Serializable {


     private Long id;
     private String posto;
     private String nomeGuerra;
     private String nomeCompleto;
     private Set saidas = new HashSet(0);

    public Mecanico() {
    }

	
    public Mecanico(String posto, String nomeGuerra, String nomeCompleto) {
        this.posto = posto;
        this.nomeGuerra = nomeGuerra;
        this.nomeCompleto = nomeCompleto;
    }
    public Mecanico(String posto, String nomeGuerra, String nomeCompleto, Set saidas) {
       this.posto = posto;
       this.nomeGuerra = nomeGuerra;
       this.nomeCompleto = nomeCompleto;
       this.saidas = saidas;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getPosto() {
        return this.posto;
    }
    
    public void setPosto(String posto) {
        this.posto = posto;
    }
    public String getNomeGuerra() {
        return this.nomeGuerra;
    }
    
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public Set getSaidas() {
        return this.saidas;
    }
    
    public void setSaidas(Set saidas) {
        this.saidas = saidas;
    }




}


