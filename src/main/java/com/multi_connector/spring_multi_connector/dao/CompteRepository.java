package com.multi_connector.spring_multi_connector.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.multi_connector.spring_multi_connector.models.Compte;
import com.multi_connector.spring_multi_connector.models.CompteDto;
import com.multi_connector.spring_multi_connector.models.CompteType;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "comptes",path = "comptes",excerptProjection = CompteDto.class)
public interface CompteRepository extends JpaRepository<Compte,Long>{
    @RestResource(path = "/byType")
    List<Compte> findByCompteType(CompteType compteType);
}