package com.example.medservice.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

//Назначение
@Entity
@Data
@Table(name="Appointment")
public class Appointment {

    @Column(name="idPatient")
    private Long idPatient;//ID пациента из таблицы Patient

    @Id
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

    @OneToMany(mappedBy = "Appointment", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Collection<Event> events;

    public Appointment(){
    }

    public Appointment(Long idPatient, Long idAppointment, String typeProceduresOrMedicines, LocalTime timePattern1
    , LocalTime timePattern2, LocalTime timePattern3, LocalTime timePattern4, LocalTime timePattern5, LocalTime timePattern6,
                       LocalDate startAppointment, LocalDate endAppointment){
        this.idPatient=idPatient;
        this.idAppointment=idAppointment;
        this.typeProceduresOrMedicines=typeProceduresOrMedicines;
        this.timePattern1=timePattern1;
        this.timePattern2=timePattern2;
        this.timePattern3=timePattern3;
        this.timePattern4=timePattern4;
        this.timePattern5=timePattern5;
        this.timePattern6=timePattern6;
        this.startAppointment=startAppointment;
        this.endAppointment=endAppointment;
    }

}
