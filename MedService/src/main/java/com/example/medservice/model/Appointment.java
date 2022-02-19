package com.example.medservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;
import java.time.LocalTime;

//Назначение
@Entity
@Data
public class Appointment {
    @Id
    @PrimaryKeyJoinColumn
    private Long idPatient;//ID пациента из таблицы Patient
    private Long idAppointment; // id назначения
    private String typeProceduresOrMedicines;//тип: процедура, лекарство
    private LocalTime timePattern1;//временной паттерн, реализация через
    private LocalTime timePattern2;//несколько записей по времени, если их меньше 4-х,
    private LocalTime timePattern3;//то просто остаются NULL и тогда в Event
    private LocalTime timePattern4;//передаются только те, для которых задано значение
    private LocalDate startAppointment;//первый день с которого начинается прием препарата или процедура
    private LocalDate endAppointment;//последний день приема препарата или процедуры
    private double medicationDosage;//доза для мед препаратов

}
