package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
public class Materia extends Base {
    @NotNull
    private String nome;
    private String descricao;
    private String observacao;
    /**
     * quantidade % de presenca necessaria
     */
    private BigDecimal presenca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public BigDecimal getPresenca() {
        return presenca;
    }

    public void setPresenca(BigDecimal presenca) {
        this.presenca = presenca;
    }
}
