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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Bruner
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")})
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "numeroPeca")
    private String numeroPeca;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "localizacao")
    private String localizacao;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "valor")
    private float valor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private Collection<ItensEntrada> itensEntradaCollection;
    @JoinColumn(name = "id_montadora", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Montadora idMontadora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduto")
    private Collection<ItensSaida> itensSaidaCollection;
    static Produto instancia = null;      
     
     public static Produto getInstacia(){
       if(  instancia == null){
         return instancia = new Produto();
         } else{ 
         return instancia;
       }
     }

    public Produto() {
    }

    public Produto(Long id) {
        this.id = id;
    }

    public Produto(Long id, String numeroPeca, String descricao, String localizacao, int quantidade, float valor) {
        this.id = id;
        this.numeroPeca = numeroPeca;
        this.descricao = descricao;
        this.localizacao = localizacao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNumeroPeca() {
        return numeroPeca;
    }

    public void setNumeroPeca(String numeroPeca) {
        this.numeroPeca = numeroPeca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
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

    public Montadora getIdMontadora() {
        return idMontadora;
    }

    public void setIdMontadora(Montadora idMontadora) {
        this.idMontadora = idMontadora;
    }

    public Collection<ItensSaida> getItensSaidaCollection() {
        return itensSaidaCollection;
    }

    public void setItensSaidaCollection(Collection<ItensSaida> itensSaidaCollection) {
        this.itensSaidaCollection = itensSaidaCollection;
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
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produto[ id=" + id + " ]";
    }
    
}
