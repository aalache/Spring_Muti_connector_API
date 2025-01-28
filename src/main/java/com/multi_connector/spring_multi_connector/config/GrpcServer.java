package com.multi_connector.spring_multi_connector.config;


import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.multi_connector.spring_multi_connector.web.grpc.CompteGrpcController;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class GrpcServer {
    
    private Server server;
    private final CompteGrpcController compteGrpcController;

    

    @PostConstruct
    public void startGrpcServer(){
        

        System.out.println("Grpc Server Starting ...");
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Grpc Server running on : http://localhost:5555/" );


        new Thread(() -> {
            try{
                server.awaitTermination();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }).start();

    }

    @PreDestroy
    public void stopGrpcServer(){
        if(server  != null){
            try {
                server.shutdown().awaitTermination();
                System.out.println("Grpc Server Stopped ......");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
