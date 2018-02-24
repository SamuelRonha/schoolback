package com.classes.estudo.model;

import com.base.model.Base;
import com.classes.localidades.model.Sala;
import com.classes.pessoas.model.Professor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@DynamicUpdate
public class Aula extends Base {

    @ManyToOne
    private Sala sala;

    @ManyToMany
    @NotNull
    private List<HoraDia> horaDias;

    private String palestra;

    @ManyToOne
    private Materia materia;

    private String palestrante;

    @ManyToOne
    private Professor professor;

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<HoraDia> getHoraDias() {
        return horaDias;
    }

    public void setHoraDias(List<HoraDia> horaDias) {
        this.horaDias = horaDias;
    }

    public String getPalestra() {
        return palestra;
    }

    public void setPalestra(String palestra) {
        this.palestra = palestra;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
