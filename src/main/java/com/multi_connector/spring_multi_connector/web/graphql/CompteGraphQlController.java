package com.multi_connector.spring_multi_connector.web.graphql;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.dto.CompteRequest;
import com.multi_connector.spring_multi_connector.dto.CompteResponse;
import com.multi_connector.spring_multi_connector.models.Compte;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CompteGraphQlController {
    
    private final CompteRepository compteRepository;
    private final ModelMapper modelMapper;

    @QueryMapping
    public List<CompteResponse> listeComptes(){
        return compteRepository.findAll()
        .stream().map(c -> modelMapper.map(c, CompteResponse.class)).toList();
    }

    @QueryMapping
    public CompteResponse getCompte(@Argument(name = "id") Long id ){
        Compte compteFound = compteRepository.findById(id).orElse(null);
        return modelMapper.map(compteFound, CompteResponse.class);
    }


    @MutationMapping
    public CompteResponse saveCompte(@Argument(name = "compte") CompteRequest compte){
        Compte newCompte = modelMapper.map(compte, Compte.class);
        Compte result = compteRepository.save(newCompte);
        return modelMapper.map(result,CompteResponse.class);
    }

    @MutationMapping
    public CompteResponse updateCompte(@Argument(name = "id") Long id, @Argument(name = "compte") CompteRequest compte){
        Compte newCompte = modelMapper.map(compte, Compte.class);
        newCompte.setId(id);
        Compte result = compteRepository.save(newCompte);
        return modelMapper.map(result, CompteResponse.class);
    }

    @MutationMapping
    public String deleteCompte(@Argument(name = "id") Long id){
        compteRepository.deleteById(id);
        return "item with id : " + id + " deleted successfuly";
    }
}
