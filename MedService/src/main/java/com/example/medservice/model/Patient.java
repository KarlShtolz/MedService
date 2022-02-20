package com.example.medservice.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

//пациент
@Entity
@Data
@Table(name="Patient")
public class Patient {
    @Id
    @Column(name="idPatient")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;//ID пациента

    @Column(name="birthDate")
    private LocalDateTime birthDate;

    @Column(name="surnamePatient")
    private String patientSurname;//фамилия пациента

    @Column(name="namePatient")
    private String namePatient;//имя пациента

    @Column(name="diagnosis")
    private String diagnosis;//диагноз

    @Column(name="healthInsuranceNumber")
    private String healthInsuranceNumber;//номер страховки

    @Column(name="attendingDoctor")
    private String attendingDoctor;//лечащий врач

    @Column(name="status")
    private String status;//статус: лечиться/выписан
}
