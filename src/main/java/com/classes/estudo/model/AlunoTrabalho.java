package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.pessoas.model.Aluno;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@DynamicUpdate
public class AlunoTrabalho extends Base {
    @ManyToOne
    @NotNull
    private Aluno aluno;

    @ManyToOne
    @NotNull
    private Trabalho trabalho;

    /**
     * 1- Andamento
     * 2- Aguardando
     * 3- Finalizado
     * 4- Cancelado
     */
    @NotNull
    @Size(min = 1, max = 4)
    private int status;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
