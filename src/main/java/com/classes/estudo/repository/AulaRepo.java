package com.classes.estudo.repository;

import com.base.repository.CustomRepo;
import com.classes.estudo.model.Aula;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by Samuel on 17/06/2017.
 */
public interface AulaRepo extends CustomRepo<Aula, Long> {

    //    @Override
    @Query("SELECT t FROM Aula t WHERE t.professor.id = ?1 AND t.materia.id = ?2")
    Aula findOneByProfessorIdAndMateriaId(Long pId, Long mId);
}
