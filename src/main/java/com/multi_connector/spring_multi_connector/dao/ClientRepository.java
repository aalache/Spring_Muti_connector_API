package com.multi_connector.spring_multi_connector.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.multi_connector.spring_multi_connector.models.Client;

@RepositoryRestResource(collectionResourceRel = "clients",path = "clients")
public interface ClientRepository extends JpaRepository<Client,Long>{

    
}