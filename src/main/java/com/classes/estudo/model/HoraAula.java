package com.classes.estudo.model;

import com.base.model.Base;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.time.DayOfWeek;

@Entity
@DynamicUpdate
public class HoraAula extends Base {

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Aula aula;

    @NotNull
    private DayOfWeek diaSemana;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    private String hora;

    @NotNull
    @ManyToOne
    private Separador separador;

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Separador getSeparador() {
        return separador;
    }

    public void setSeparador(Separador separador) {
        this.separador = separador;
    }
}
