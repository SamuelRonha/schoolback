package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.localidades.model.Sala;
import com.classes.pessoas.model.Aluno;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@DynamicUpdate
public class Turma extends Base {
    @NotNull
    private String nome;

    @ManyToMany
    private List<Aluno> alunos;

    @OneToOne
    private Sala sala;

    @OneToMany
    private List<HoraAula> horaAulas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<HoraAula> getHoraAulas() {
        return horaAulas;
    }

    public void setHoraAulas(List<HoraAula> horaAulas) {
        this.horaAulas = horaAulas;
    }
}
