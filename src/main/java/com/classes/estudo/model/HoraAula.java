package com.classes.estudo.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@DynamicUpdate
public class HoraAula extends Base {

    @NotNull
    @ManyToOne
    private Aula aula;
    @NotNull
    @ManyToOne
    private HoraDia horaDia;

}
