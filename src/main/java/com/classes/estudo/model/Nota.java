package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@DynamicUpdate
public class Nota extends Base {

    private String tipo;

    @ManyToOne
    @NotNull
    private Materia materia;

    @ManyToOne
    private Tarefa tarefa;

    @ManyToOne
    private Trabalho trabalho;

    @ManyToOne
    private AnoLetivo anoLetivo;

    @ManyToOne
    private Separador separador;

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public AnoLetivo getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(AnoLetivo anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public Separador getSeparador() {
        return separador;
    }

    public void setSeparador(Separador separador) {
        this.separador = separador;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}
