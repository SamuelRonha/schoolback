package com.classes.basicos.model;

import com.base.model.Base;
import com.classes.estudo.model.Turma;
import com.classes.pessoas.model.Aluno;
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

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Anexo anexo;


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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Anexo getAnexo() {
        return anexo;
    }

    public void setAnexo(Anexo anexo) {
        this.anexo = anexo;
    }
}
