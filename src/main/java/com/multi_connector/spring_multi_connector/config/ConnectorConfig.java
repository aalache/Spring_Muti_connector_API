package com.multi_connector.spring_multi_connector.config;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

public class ConnectorConfig {
    
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainer(){
        return factory->{
            // REST API Connector (Default 8080) 
            Connector restApiConnector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
            restApiConnector.setPort(8080);
            factory.addAdditionalTomcatConnectors(restApiConnector);

            // GraphQl API Connector (port:8081)
            Connector graphQlApiConnector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
            graphQlApiConnector.setPort(8081);
            factory.addAdditionalTomcatConnectors(graphQlApiConnector);
        };
    }
}
