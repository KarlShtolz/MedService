package com.example.medservice.model;

import lombok.Data;

import javax.persistence.*;

//пациент
@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private Long id;
    private String fullName;//фио
    private String healthInsuranceNumber;//номер страховки
    private String attendingDoctor;//лечащий врач
    private String status;//статус: лечиться/выписан
}
