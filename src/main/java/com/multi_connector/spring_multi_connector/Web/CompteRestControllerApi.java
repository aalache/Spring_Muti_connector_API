package com.multi_connector.spring_multi_connector.Web;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.models.Compte;

import lombok.AllArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




// @RestController
@AllArgsConstructor
@RequestMapping("/bank")
public class CompteRestControllerApi {
    
    public final CompteRepository compteRepository;

    @GetMapping(path = "/comptes", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<Compte> listComptes(){
        return compteRepository.findAll();
    }

    @GetMapping("/comptes/{id}")
    public Compte getCompte(@PathVariable(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }

    @PostMapping("/comptes")
    public ResponseEntity<Compte> save(@RequestBody Compte compte) {
        compteRepository.save(compte);
        return ResponseEntity.ok().body(compte);
    }
    
    @PutMapping("/comptes/{id}")
    public ResponseEntity<Compte> update(@PathVariable Long id, @RequestBody Compte compte) {
        compte.setId(id);
        Compte newCompte = compteRepository.save(compte);
        return ResponseEntity.accepted().body(newCompte);
    }

    @DeleteMapping("/comptes/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        compteRepository.deleteById(id);
        return ResponseEntity.ok().body("Compte with id = " + id + " was deleted successfuly");
    }
    
}
