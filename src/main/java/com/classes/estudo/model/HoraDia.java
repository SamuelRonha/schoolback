package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.time.DayOfWeek;

@Entity
@DynamicUpdate
public class HoraDia extends Base {
    @NotNull
    private DayOfWeek diaSemana;
    @NotNull
    private Time hora;

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
