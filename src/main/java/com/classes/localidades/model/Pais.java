package com.classes.localidades.model;


import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by Samuel on 23/04/2017.
 */
@Entity
@DynamicUpdate
public class Pais extends Base {

    @Column
    @NotNull
    private String nome;

    @Column
    @NotNull
    private Integer codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
}
