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
@Table(name = "ordem_de_servico")
@NamedQueries({
    @NamedQuery(name = "OrdemDeServico.findAll", query = "SELECT o FROM OrdemDeServico o")})
public class OrdemDeServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Basic(optional = false)
    @Column(name = "ebPlaca")
    private String ebPlaca;
    @Basic(optional = false)
    @Column(name = "dataEntrada")
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Column(name = "observacoes")
    private String observacoes;
    @Basic(optional = false)
    @Column(name = "viatura")
    private String viatura;
    @Basic(optional = false)
    @Column(name = "om")
    private String om;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdemDeServico")
    private Collection<Saida> saidaCollection;
    static OrdemDeServico instancia = null;      
     
     public static OrdemDeServico getInstacia(){
       if(  instancia == null){
         return instancia = new OrdemDeServico();
         } else{ 
         return instancia;
       }
     }

    public OrdemDeServico() {
    }

    public OrdemDeServico(Long id) {
        this.id = id;
    }

    public OrdemDeServico(Long id, String ebPlaca, Date dataEntrada, String viatura, String om) {
        this.id = id;
        this.ebPlaca = ebPlaca;
        this.dataEntrada = dataEntrada;
        this.viatura = viatura;
        this.om = om;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getEbPlaca() {
        return ebPlaca;
    }

    public void setEbPlaca(String ebPlaca) {
        this.ebPlaca = ebPlaca;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getViatura() {
        return viatura;
    }

    public void setViatura(String viatura) {
        this.viatura = viatura;
    }

    public String getOm() {
        return om;
    }

    public void setOm(String om) {
        this.om = om;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof OrdemDeServico)) {
            return false;
        }
        OrdemDeServico other = (OrdemDeServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.OrdemDeServico[ id=" + id + " ]";
    }
    
}
