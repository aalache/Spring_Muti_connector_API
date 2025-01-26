package com.multi_connector.spring_multi_connector.Web;

import java.util.List;

import org.springframework.stereotype.Component;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.models.Compte;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;

@Component
@WebService(name = "BankWS")
@AllArgsConstructor
public class CompteSoapService {
    
    private final CompteRepository compteRepository;

    @WebMethod(operationName = "listeComptes")
    public List<Compte> listeComptes(){
        return compteRepository.findAll();
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "id") Long id){
        return compteRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Compte save( Compte compte){
        return compteRepository.save(compte);
    }

    @WebMethod
    public Compte update(@WebParam(name = "id") Long id, @WebParam(name = "compte") Compte compte){
        compte.setId(id);
        return compteRepository.save(compte);
    }

    @WebMethod
    public String delete(@WebParam(name = "id") Long id){
        compteRepository.deleteById(id);
        return "item with id : " + id + " deleted successfuly";
    }
}
