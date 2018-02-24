package com.classes.basicos.model;

import com.base.model.Base;
import com.classes.estudo.model.Turma;
import com.classes.pessoas.model.Funcionario;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@DynamicUpdate
public class Requisicao extends Base {
    @NotNull
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Turma turma;


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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
