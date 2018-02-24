package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@DynamicUpdate
public class AnoLetivo extends Base {
    @Max(9999)
    private int ano;

    @NotNull
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Separador> separadors;

    private LocalDate inicio;

    private LocalDate fim;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Separador> getSeparadors() {
        return separadors;
    }

    public void setSeparadors(List<Separador> separadors) {
        this.separadors = separadors;
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
}
