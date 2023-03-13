
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
* Classe que representa a tabela CLIENTES
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"CLIENTES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Clientes")
public class Clientes implements Serializable {
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
    @Column(name = "first_name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String first_name;


    /**
    * @generated
    */
    @Column(name = "last_name", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String last_name;


    /**
    * @generated
    */
    @Column(name = "email", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String email;


    /**
    * @generated
    */
    @Column(name = "genero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String genero;


    /**
    * @generated
    */
    @Column(name = "profissao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String profissao;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_endereco", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Endereco endereco;


    /**
    * Construtor
    * @generated
    */
    public Clientes(){
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
    public Clientes setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém first_name
    * return first_name
    * @generated
    */
    public java.lang.String getFirst_name() {
        return this.first_name;
    }

    /**
    * Define first_name
    * @param first_name first_name
    * @generated
    */
    public Clientes setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
        return this;
    }
    /**
    * Obtém last_name
    * return last_name
    * @generated
    */
    public java.lang.String getLast_name() {
        return this.last_name;
    }

    /**
    * Define last_name
    * @param last_name last_name
    * @generated
    */
    public Clientes setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
        return this;
    }
    /**
    * Obtém email
    * return email
    * @generated
    */
    public java.lang.String getEmail() {
        return this.email;
    }

    /**
    * Define email
    * @param email email
    * @generated
    */
    public Clientes setEmail(java.lang.String email) {
        this.email = email;
        return this;
    }
    /**
    * Obtém genero
    * return genero
    * @generated
    */
    public java.lang.String getGenero() {
        return this.genero;
    }

    /**
    * Define genero
    * @param genero genero
    * @generated
    */
    public Clientes setGenero(java.lang.String genero) {
        this.genero = genero;
        return this;
    }
    /**
    * Obtém profissao
    * return profissao
    * @generated
    */
    public java.lang.String getProfissao() {
        return this.profissao;
    }

    /**
    * Define profissao
    * @param profissao profissao
    * @generated
    */
    public Clientes setProfissao(java.lang.String profissao) {
        this.profissao = profissao;
        return this;
    }
    /**
    * Obtém endereco
    * return endereco
    * @generated
    */
    public Endereco getEndereco() {
        return this.endereco;
    }

    /**
    * Define endereco
    * @param endereco endereco
    * @generated
    */
    public Clientes setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Clientes object = (Clientes)obj;
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