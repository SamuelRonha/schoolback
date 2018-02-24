package com.classes.pessoas.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Usuario extends Base {


    @Column(unique = true)
    @NotNull
    private String nome;

    @Column
    @NotNull
    private String senha;

    @Column(columnDefinition = "varchar(100) default 'BASIC'")
    @Pattern(regexp = "ADMIN|GERENTE|EMPREGADO|PROFESSOR|PARENTE|ALUNO|BASICO")
    private String acesso;

    @Column
    private Boolean status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
