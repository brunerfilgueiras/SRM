/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Bruner
 */
@Entity
@Table(name = "mecanico")
@NamedQueries({
    @NamedQuery(name = "Mecanico.findAll", query = "SELECT m FROM Mecanico m")})
public class Mecanico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "posto")
    private String posto;
    @Basic(optional = false)
    @Column(name = "nomeGuerra")
    private String nomeGuerra;
    @Basic(optional = false)
    @Column(name = "nomeCompleto")
    private String nomeCompleto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMecanico")
    private Collection<Saida> saidaCollection;
    static Mecanico instancia = null;     
     
     public static Mecanico getInstacia(){
       if(  instancia == null){
         return instancia = new Mecanico();
         } else{ 
         return instancia;
       }
     }

    public Mecanico() {
    }

    public Mecanico(Long id) {
        this.id = id;
    }

    public Mecanico(Long id, String posto, String nomeGuerra, String nomeCompleto) {
        this.id = id;
        this.posto = posto;
        this.nomeGuerra = nomeGuerra;
        this.nomeCompleto = nomeCompleto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Collection<Saida> getSaidaCollection() {
        return saidaCollection;
    }

    public void setSaidaCollection(Collection<Saida> saidaCollection) {
        this.saidaCollection = saidaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mecanico)) {
            return false;
        }
        Mecanico other = (Mecanico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Mecanico[ id=" + id + " ]";
    }
    
}
