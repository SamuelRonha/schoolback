package com.classes.pessoas.model;

import com.base.model.Base;
import com.classes.basicos.model.Formacao;
import com.classes.estudo.model.HoraAula;
import com.classes.estudo.model.Turma;
import com.classes.localidades.model.Sala;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Aluno extends Base {

    @Column
    @NotNull
    private String numero;

    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Pessoa pessoa;

    @OneToMany
    private List<Formacao> formacaos;

    @OneToMany
    private List<Parentesco> parentescos;

    @OneToMany
    private List<HoraAula> horaAulas;

    @OneToOne
    private Turma turma;

    @OneToOne
    private Sala sala;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Formacao> getFormacaos() {
        return formacaos;
    }

    public void setFormacaos(List<Formacao> formacaos) {
        this.formacaos = formacaos;
    }

    public List<Parentesco> getParentescos() {
        return parentescos;
    }

    public void setParentescos(List<Parentesco> parentescos) {
        this.parentescos = parentescos;
    }


    public List<HoraAula> getHoraAulas() {
        return horaAulas;
    }

    public void setHoraAulas(List<HoraAula> horaAulas) {
        this.horaAulas = horaAulas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }


}
