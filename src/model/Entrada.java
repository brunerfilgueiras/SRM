/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Bruner
 */
@Entity
@Table(name = "entrada")
@NamedQueries({
    @NamedQuery(name = "Entrada.findAll", query = "SELECT e FROM Entrada e")})
public class Entrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "numeroNota")
    private String numeroNota;
    @Basic(optional = false)
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @Column(name = "valorTotal")
    private float valorTotal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEntrada")
    private Collection<ItensEntrada> itensEntradaCollection;
    @JoinColumn(name = "id_empenho", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empenho idEmpenho;
    static Entrada instancia = null; 
    
     public static Entrada getInstacia(){
       if(  instancia == null){
         return instancia = new Entrada();
         } else{ 
         return instancia;
       }
     }

    public Entrada() {
    }

    public Entrada(Long id) {
        this.id = id;
    }

    public Entrada(Long id, Date data, float valorTotal) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<ItensEntrada> getItensEntradaCollection() {
        return itensEntradaCollection;
    }

    public void setItensEntradaCollection(Collection<ItensEntrada> itensEntradaCollection) {
        this.itensEntradaCollection = itensEntradaCollection;
    }

    public Empenho getIdEmpenho() {
        return idEmpenho;
    }

    public void setIdEmpenho(Empenho idEmpenho) {
        this.idEmpenho = idEmpenho;
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
        if (!(object instanceof Entrada)) {
            return false;
        }
        Entrada other = (Entrada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Entrada[ id=" + id + " ]";
    }
    
}
