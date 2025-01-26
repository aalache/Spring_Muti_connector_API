package com.multi_connector.spring_multi_connector;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.multi_connector.spring_multi_connector.dao.ClientRepository;
import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.models.Client;
import com.multi_connector.spring_multi_connector.models.Compte;
import com.multi_connector.spring_multi_connector.models.CompteType;

@SpringBootApplication
public class SpringMultiConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultiConnectorApplication.class, args);
	}

	@Bean
	CommandLineRunner initialize(CompteRepository compteRepository ,RepositoryRestConfiguration restConfiguration,ClientRepository clientRepository){
		return args -> {
			restConfiguration.exposeIdsFor(Compte.class);

			List<Client> clients = List.of(
				Client.builder()
				.firstname("omar")
				.lastname("aalache")
				.build(),
				Client.builder()
				.firstname("zakaria")
				.lastname("chemaou")
				.build()
			);

			clientRepository.saveAll(clients);
			

			List<Compte> comptes = List.of(
				Compte.builder()
				.solde(Math.random()*10000)
				.creationDate(LocalDate.now())
				.compteType(CompteType.COMPTE_COURANT)
				.client(clients.get(0))
				.build(),
				Compte.builder()
				.solde(Math.random()*10000)
				.creationDate(LocalDate.now())
				.compteType(CompteType.COMPTE_EPARGNE)
				.client(clients.get(1)) 
				.build(),
				Compte.builder()
				.solde(Math.random()*10000)
				.creationDate(LocalDate.now())
				.compteType(CompteType.COMPTE_COURANT)
				.build(),
				Compte.builder()
				.solde(Math.random()*10000)
				.creationDate(LocalDate.now())
				.compteType(CompteType.COMPTE_EPARGNE)
				.build(),
				Compte.builder()
				.solde(Math.random()*10000)
				.creationDate(LocalDate.now())
				.compteType(CompteType.COMPTE_COURANT)
				.build()
			);

			compteRepository.saveAll(comptes);
		};
	}
}
