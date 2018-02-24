package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.pessoas.model.Professor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@DynamicUpdate
public class Trabalho extends Base {

    @NotNull
    private String titulo;

    private String descricao;

    /**
     * Prova
     * TrabalhoRepo
     */
    private int tipo;

    @NotNull
    private LocalDate inicio;
    private LocalDate fim;

    /**
     * Andamento, Aguardando, Finalizado ou Cancelado
     */
    @Size(min = 1, max = 4)
    private int status;

    @NotNull
    @ManyToOne
    private Materia materia;

    @NotNull
    @ManyToOne
    private Professor professor;

    @OneToMany
    private List<Turma> turmas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
}
