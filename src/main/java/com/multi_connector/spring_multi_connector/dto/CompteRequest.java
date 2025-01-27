package com.multi_connector.spring_multi_connector.dto;

import java.time.LocalDate;



import com.multi_connector.spring_multi_connector.models.CompteType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class CompteRequest {
    private Long id;
    private Double solde;
    private LocalDate creationDate;
    private CompteType compteType;
    private ClientRequest client;
}
