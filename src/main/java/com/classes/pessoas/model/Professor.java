package com.classes.pessoas.model;

import com.base.model.Base;
import com.classes.estudo.model.Materia;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by Samuel on 17/06/2017.
 */
@Entity
@DynamicUpdate
public class Professor extends Base {

    @NotNull
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Funcionario funcionario;

    @ManyToMany
    private List<Materia> materias;

    @Transient
    private String nome;



    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getNome() {
        return funcionario.getPessoa().getNome();
    }
}
