package com.multi_connector.spring_multi_connector.web.grpc;


import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.multi_connector.spring_multi_connector.dao.CompteRepository;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.CompteGrpc.CompteImplBase;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteRequest;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.CompteResponse;
import com.multi_connector.spring_multi_connector.web.grpc.stubs.Schema.ResponseEntity;
import com.multi_connector.spring_multi_connector.models.Compte;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class CompteGrpcController extends CompteImplBase  {

    private final CompteRepository compteRepository;
    private final ModelMapper modelMapper;
    
    @Override
    public void getCompte(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        Long id = request.getId();
        Compte compteFound = compteRepository.findById(id).orElse(null);
        CompteResponse response = modelMapper.map(compteFound,CompteResponse.class );
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listeComptes(CompteRequest request, StreamObserver<CompteResponse> responseObserver) {
        
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
