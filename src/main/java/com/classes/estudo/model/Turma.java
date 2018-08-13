package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.localidades.model.Sala;
import com.classes.pessoas.model.Aluno;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
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

//    @ManyToOne
//    private AnoLetivo anoLetivo;

    @NotNull
    @OneToMany(cascade = CascadeType.ALL)
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

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

//    public AnoLetivo getAnoLetivo() {
//        return anoLetivo;
//    }
//
//    public void setAnoLetivo(AnoLetivo anoLetivo) {
//        this.anoLetivo = anoLetivo;
//    }
}
