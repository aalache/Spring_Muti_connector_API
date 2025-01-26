package com.multi_connector.spring_multi_connector.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.multi_connector.spring_multi_connector.Web.CompteJaxRSApi;
import com.multi_connector.spring_multi_connector.Web.CompteSoapService;

import jakarta.xml.ws.Endpoint;


@Configuration
public class MyConfig {
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
}
