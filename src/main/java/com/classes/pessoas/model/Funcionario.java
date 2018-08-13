package com.classes.pessoas.model;

import com.base.model.Base;
import com.classes.basicos.model.Funcao;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Funcionario extends Base {

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Pessoa pessoa;

    private BigDecimal salario;

    @ManyToOne
    private Funcao funcao;


    @Transient
    private String nome;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return pessoa.getNome();
    }
}
