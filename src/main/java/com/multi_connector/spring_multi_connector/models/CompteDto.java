package com.multi_connector.spring_multi_connector.models;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;



@Projection(name = "dto",types = { Compte.class })
public interface CompteDto { 
    public Long getId();
    public Double getSolde();
    public LocalDate getCreationDate();
    public CompteType getCompteType();
}

