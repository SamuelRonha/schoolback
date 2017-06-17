package com.locations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Samuel on 17/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface Country extends JpaRepository<com.locations.model.Country, Long> {

    List<com.locations.model.Country> findById(@Param("id") Long id);

}
