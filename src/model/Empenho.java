package model;
// Generated 22/09/2013 15:07:10 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empenho generated by hbm2java
 */
public class Empenho  implements java.io.Serializable {


     private Long id;
     private Fornecedor fornecedor;
     private String numero;
     private Date data;
     private float saldo;
     private float valor;
     private Set entradas = new HashSet(0);

    public Empenho() {
    }

	
    public Empenho(Fornecedor fornecedor, String numero, Date data, float saldo, float valor) {
        this.fornecedor = fornecedor;
        this.numero = numero;
        this.data = data;
        this.saldo = saldo;
        this.valor = valor;
    }
    public Empenho(Fornecedor fornecedor, String numero, Date data, float saldo, float valor, Set entradas) {
       this.fornecedor = fornecedor;
       this.numero = numero;
       this.data = data;
       this.saldo = saldo;
       this.valor = valor;
       this.entradas = entradas;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }
    
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Set getEntradas() {
        return this.entradas;
    }
    
    public void setEntradas(Set entradas) {
        this.entradas = entradas;
    }




}


