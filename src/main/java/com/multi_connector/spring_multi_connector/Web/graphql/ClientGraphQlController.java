package com.multi_connector.spring_multi_connector.Web.graphql;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.multi_connector.spring_multi_connector.dao.ClientRepository;
import com.multi_connector.spring_multi_connector.dto.ClientRequest;
import com.multi_connector.spring_multi_connector.dto.ClientResponse;
import com.multi_connector.spring_multi_connector.models.Client;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ClientGraphQlController {
    
     private final ClientRepository clientRepository;
     private final ModelMapper modelMapper;

    @QueryMapping
    public List<ClientResponse> listeClients(){
        return clientRepository.findAll()
        .stream().map(client -> modelMapper.map(client, ClientResponse.class))
        .toList();
    }

    @QueryMapping
    public ClientResponse getClient(@Argument Long id ){
        Client clientFound = clientRepository.findById(id).orElse(null);
        return modelMapper.map(clientFound, ClientResponse.class);
    }


    @MutationMapping
    public ClientResponse saveClient(@Argument ClientRequest client){
        Client newClient = modelMapper.map(client, Client.class);
        Client result = clientRepository.save(newClient);
        return modelMapper.map(result, ClientResponse.class);
    }

    @MutationMapping
    public ClientResponse updateClient(@Argument Long id, @Argument ClientRequest client){
        Client newClient = modelMapper.map(client, Client.class);
        newClient.setId(id);
        Client result = clientRepository.save(newClient);
        return modelMapper.map(result, ClientResponse.class);
    }

    @MutationMapping
    public String deleteClient(@Argument Long id){
        clientRepository.deleteById(id);
        return "item with id : " + id + " deleted successfuly";
    }
}
