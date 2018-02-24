package com.classes.pessoas.model;

import com.base.model.Base;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Pattern;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Parentesco extends Base {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Pessoa pessoa;

    @Pattern(regexp = "PAI|MAE|IRMAO|TIO|AVO|RESPONSAVEL|OUTRO")
    private String tipo;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
