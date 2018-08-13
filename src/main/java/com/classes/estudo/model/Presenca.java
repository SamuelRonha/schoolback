package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.pessoas.model.Aluno;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@DynamicUpdate
public class Presenca extends Base{

    @NotNull
    @ManyToMany
    private List<Aluno> alunos;

    @NotNull
    @ManyToOne
    private Aula aula;

    @NotNull
    private Date data;


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
