package com.classes.basicos.model;

import com.base.model.Base;
import com.classes.pessoas.model.Funcionario;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@DynamicUpdate
public class BancoHoras extends Base {
    @NotNull
    @ManyToOne
    private Funcionario funcionario;

    private LocalDate entrada;

    private LocalDate saida;

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDate entrada) {
        this.entrada = entrada;
    }

    public LocalDate getSaida() {
        return saida;
    }

    public void setSaida(LocalDate saida) {
        this.saida = saida;
    }
}
