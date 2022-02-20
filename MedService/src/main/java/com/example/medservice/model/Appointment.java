package com.example.medservice.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
//Назначение
@Entity
@Data
@Table(name="Appointment")
public class Appointment {
    @Id
    @Column(name="idPatient")
    private Long idPatient;//ID пациента из таблицы Patient

    @Column(name="idAppointment")
    private Long idAppointment; // id назначения

    @Column(name="typeProceduresOrMedicines")
    private String typeProceduresOrMedicines;//тип: процедура, лекарство

    @Column(name="timePattern1")
    private LocalTime timePattern1;//временной паттерн, реализация через

    @Column(name="timePattern2")
    private LocalTime timePattern2;//несколько записей по времени, если их меньше 4-х,

    @Column(name="timePattern3")
    private LocalTime timePattern3;//то просто остаются NULL и тогда в Event

    @Column(name="timePattern4")
    private LocalTime timePattern4;//передаются только те, для которых задано значение

    @Column(name="timePattern5")
    private LocalTime timePattern5;

    @Column(name="timePattern6")
    private LocalTime timePattern6;

    @Column(name="startAppointment")
    private LocalDate startAppointment;//первый день с которого начинается прием препарата или процедура

    @Column(name="endAppointment")
    private LocalDate endAppointment;//последний день приема препарата или процедуры

    @Column(name="medicationDosage")
    private double medicationDosage;//доза для мед препаратов

}
