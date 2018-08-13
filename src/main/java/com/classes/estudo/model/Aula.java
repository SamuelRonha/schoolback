package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.pessoas.model.Professor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
@DynamicUpdate
public class Aula extends Base {

    @ManyToOne
    private Materia materia;

    @ManyToOne
    private Professor professor;

    @Transient
    private String nome;

    public Aula() {
    }

    public Aula(Materia materia, Professor professor) {
        this.materia = materia;
        this.professor = professor;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return this.getProfessor().getFuncionario().getPessoa().getNome() + " - " + this.getMateria().getNome();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
