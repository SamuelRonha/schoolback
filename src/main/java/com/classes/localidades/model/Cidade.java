package com.classes.localidades.model;


import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Cidade extends Base {

    @Column
    @NotNull
    private String nome;

    @Column
    @NotNull
    private Integer codigo;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Estado estado;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
