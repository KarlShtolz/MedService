package com.example.medservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;

//Назначение
@Entity
@Data
public class Appointment {
    @Id
    @PrimaryKeyJoinColumn
    private Long id;//ID пациента из таблицы Patient
    private String typeProceduresOrMedicines;//тип: процедура, лекарство
    private String timePattern;//временной паттерн(например дважды в день утром и вечером)
    //можно развернуть в применениее с перерывом времени или сразу создать локалДейтТаймы
    private LocalDate startAppointment;
    private LocalDate endAppointment;
    private double medicationDosage;//доза для мед препаратов

}
