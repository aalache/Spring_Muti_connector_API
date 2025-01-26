package com.multi_connector.spring_multi_connector.Web;

import java.util.List;

import org.springframework.stereotype.Component;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.models.Compte;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;

@Component
@Path("/bank")
@AllArgsConstructor
public class CompteJaxRSApi {
    private final CompteRepository compteRepository;

    @Path("/comptes")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @Path("/comptes/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Compte getCompte(@PathParam(value = "id") Long id){
        return compteRepository.findById(id).orElse(null);
    }

    @Path("/comptes")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Compte save(Compte compte){
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Compte update(@PathParam(value = "id") Long id,Compte compte){
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @Path("/comptes/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam(value = "id") Long id){
        compteRepository.deleteById(id);
    }
}
