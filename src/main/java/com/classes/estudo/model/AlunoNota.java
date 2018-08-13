package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.pessoas.model.Aluno;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@DynamicUpdate
public class AlunoNota extends Base {

    @NotNull
    @ManyToOne
    private Aluno aluno;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
    private List<Nota> notas = new ArrayList<>();

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

}
