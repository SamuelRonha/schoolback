package com.classes.estudo.model;

import com.base.model.Base;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.DynamicUpdate;

import javax.jdo.annotations.Unique;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@DynamicUpdate
public class AnoLetivo extends Base {
    @Max(9999)
    @Unique
    private int ano;

    @NotNull
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Separador> separadors;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date inicio;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date fim;

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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}
