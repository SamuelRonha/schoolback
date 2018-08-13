package com.classes.basicos.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Time;

@Entity
@DynamicUpdate
public class Funcao extends Base {
    @NotNull
    private String nome;
    private String descricao;
    private String valor;
    @Pattern(regexp = "DIA|HORA|MENSAL|ANUAL")
    private String tempo;

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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
