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
public class AlunoTarefa extends Base {
    @ManyToOne
    @NotNull
    private Aluno aluno;

    @ManyToOne
    @NotNull
    private Tarefa tarefa;

    @ManyToOne
    private Nota nota;

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

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
