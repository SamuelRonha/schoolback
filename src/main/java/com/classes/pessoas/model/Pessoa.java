package com.classes.pessoas.model;

import com.base.model.Base;
import com.classes.basicos.model.Anexo;
import com.classes.localidades.model.Endereco;
import com.classes.localidades.model.Telefone;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Pessoa extends Base {

    @Column
    @NotNull
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    @NotNull
    private Set<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Telefone> telefones;

    @Column
    @CPF
    private String cpf;

    @Email
    private String email;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @NotNull
    private Usuario usuario;

    @ManyToOne
    private Anexo foto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Set<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Anexo getFoto() {
        return foto;
    }

    public void setFoto(Anexo foto) {
        this.foto = foto;
    }
}
