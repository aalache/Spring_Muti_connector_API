package com.multi_connector.spring_multi_connector.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.web.grpc.CompteGrpcController;
import com.multi_connector.spring_multi_connector.web.rest.CompteJaxRSApi;
import com.multi_connector.spring_multi_connector.web.soap.CompteSoapService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.xml.ws.Endpoint;
import lombok.AllArgsConstructor;


@Configuration
@AllArgsConstructor
public class MyConfig {
    private final CompteRepository compteRepository;
    private final ModelMapper modelMapper;
    private final CompteGrpcController compteGrpcController;
    // @Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteJaxRSApi.class);

        return jerseyServlet;
    }

    @Bean
    public Endpoint endpoint(CompteSoapService service){
        return Endpoint.publish("http://localhost:8082/", service);
    }

    @Bean
    public CompteGrpcController grpcCompteController(){
        return  new CompteGrpcController(compteRepository, modelMapper);
    }

    @Bean
    public Server grpcServer(){
        return ServerBuilder.forPort(5555)
        .addService(compteGrpcController)
        .build();
    }
}
