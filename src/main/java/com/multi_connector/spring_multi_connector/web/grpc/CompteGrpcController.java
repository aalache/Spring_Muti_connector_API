package com.multi_connector.spring_multi_connector.web.grpc;


import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.CompteGrpc.CompteImplBase;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity;
import com.multi_connector.spring_multi_connector.models.Compte;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CompteGrpcController extends CompteImplBase  {

    private final CompteRepository compteRepository;
    private final ModelMapper modelMapper;
    
    public  CompteResponse toCompteResponse(Compte compte){
        return CompteResponse.newBuilder()
        .setId(compte.getId())
        .setSolde(compte.getSolde())
        // .setCompteType(compte.getCompteType())
        // .setCreationDate(null)
        .build();
    }

    @Override
    @Transactional
    public void getCompte(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        Long id = request.getId();
        Compte compteFound = compteRepository.findById(id).orElse(null);
        CompteResponse response = CompteResponse.newBuilder()
        .setId(compteFound.getId())
        // .setCreationDate(compteFound.getCreationDate())
        .setSolde(compteFound.getSolde())
        .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listeComptes(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        // List<Compte> comptes = compteRepository.findAll();
        List<CompteResponse> responseCompteArray = compteRepository.findAll().stream().map(c -> toCompteResponse(c)).toList();
        System.out.println("There is " + responseCompteArray.size() +  " items in the array");

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            int counter =0;
            @Override
            public void run() {
                    responseCompteArray.forEach(c -> {
                        responseObserver.onNext(c);
                        ++counter;
                    });
                    if(counter ==responseCompteArray.size()) {
                        responseObserver.onCompleted();
                        timer.cancel();
                    };
            }
                    
        }, 1000, 1000);
    }

    @Override
    public void saveCompte(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.saveCompte(request, responseObserver);
    }

    @Override
    public void updateCompte(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        // TODO Auto-generated method stub
        super.updateCompte(request, responseObserver);
    }

    @Override
    public void deleteCompte(CompteRequest request, StreamObserver<ResponseEntity> responseObserver) {
        // TODO Auto-generated method stub
        super.deleteCompte(request, responseObserver);
    }
}
