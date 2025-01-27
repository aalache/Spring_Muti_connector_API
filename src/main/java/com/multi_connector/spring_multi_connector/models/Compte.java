package com.multi_connector.spring_multi_connector.models;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Comptes")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double solde;
    @DateTimeFormat
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    private CompteType compteType;

    @ManyToOne
    @JoinColumn(name = "client_id" ,nullable = false)
    @XmlTransient
    @JsonIgnoreProperties("comptes")
    private Client client;
}
