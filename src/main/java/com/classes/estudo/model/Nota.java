package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
public class Nota extends Base {


    @ManyToOne
    @NotNull
    private Aula aula;

//    @ManyToOne
//    private Tarefa tarefa;

//    @ManyToOne
//    private Trabalho trabalho;


    @ManyToOne
    private Separador separador;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private String tipo;

//    public Trabalho getTrabalho() {
//        return trabalho;
//    }
//
//    public void setTrabalho(Trabalho trabalho) {
//        this.trabalho = trabalho;
//    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Separador getSeparador() {
        return separador;
    }

    public void setSeparador(Separador separador) {
        this.separador = separador;
    }

//    public Tarefa getTarefa() {
//        return tarefa;
//    }
//
//    public void setTarefa(Tarefa tarefa) {
//        this.tarefa = tarefa;
//    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
