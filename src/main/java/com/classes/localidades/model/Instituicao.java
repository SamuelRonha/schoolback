package com.classes.localidades.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DynamicUpdate
public class Instituicao extends Base {

    @ManyToOne
    private Endereco endereco;

    private String nome;

    private String documento;

    /**
     * Núcleo regional de educação
     */
    private String nre;

    private String descricao;

    private String autorizacao;

    /**
     * Inscrição municipal
     */
    private String inscmun;

    private String credenciamento;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNre() {
        return nre;
    }

    public void setNre(String nre) {
        this.nre = nre;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getInscmun() {
        return inscmun;
    }

    public void setInscmun(String inscmun) {
        this.inscmun = inscmun;
    }

    public String getCredenciamento() {
        return credenciamento;
    }

    public void setCredenciamento(String credenciamento) {
        this.credenciamento = credenciamento;
    }
}
