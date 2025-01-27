package com.multi_connector.spring_multi_connector.dto;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private Collection<CompteResponse> comptes;
}
