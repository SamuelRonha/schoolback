package com.classes.localidades.model;


import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Sala extends Base {

    @Column
    @NotNull
    private String numero;

    @Column
    private int andar;
    /**
     * number of chairs on this room
     */
    @Column
    private int cadeiras;

    @Transient
    private String nome;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public String getNome() {
        return numero;
    }
}
