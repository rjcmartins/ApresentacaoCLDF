
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela ENDERECO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ENDERECO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Endereco")
public class Endereco implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "Logradouro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String logradouro;


    /**
    * @generated
    */
    @Column(name = "Numero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String numero;


    /**
    * @generated
    */
    @Column(name = "Bairro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String bairro;


    /**
    * @generated
    */
    @Column(name = "UF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String uf;


    /**
    * Construtor
    * @generated
    */
    public Endereco(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Endereco setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém logradouro
    * return logradouro
    * @generated
    */
    public java.lang.String getLogradouro() {
        return this.logradouro;
    }

    /**
    * Define logradouro
    * @param logradouro logradouro
    * @generated
    */
    public Endereco setLogradouro(java.lang.String logradouro) {
        this.logradouro = logradouro;
        return this;
    }
    /**
    * Obtém numero
    * return numero
    * @generated
    */
    public java.lang.String getNumero() {
        return this.numero;
    }

    /**
    * Define numero
    * @param numero numero
    * @generated
    */
    public Endereco setNumero(java.lang.String numero) {
        this.numero = numero;
        return this;
    }
    /**
    * Obtém bairro
    * return bairro
    * @generated
    */
    public java.lang.String getBairro() {
        return this.bairro;
    }

    /**
    * Define bairro
    * @param bairro bairro
    * @generated
    */
    public Endereco setBairro(java.lang.String bairro) {
        this.bairro = bairro;
        return this;
    }
    /**
    * Obtém uf
    * return uf
    * @generated
    */
    public java.lang.String getUf() {
        return this.uf;
    }

    /**
    * Define uf
    * @param uf uf
    * @generated
    */
    public Endereco setUf(java.lang.String uf) {
        this.uf = uf;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Endereco object = (Endereco)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}