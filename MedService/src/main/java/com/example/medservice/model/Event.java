package com.example.medservice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
//событие
@Data
@Entity
@Table(name="Event")
public class Event {

    @Column(name="idAppointment")
    private Long idAppointment;//id назначения

    @Id
    @Column(name="idEvent")
    private Long idEvent;//id события

    @Column(name="dateTimeEvent")
    private LocalDateTime dateTimeEvent;//дата и время события

    @Column(name="typeProceduresOrMedicines")
    private String typeProceduresOrMedicines;//тип процедуры или лекарства

    @Column(name="statusAppointment")
    private String statusAppointment;//статус: выполнен/не выполнен/отменено

    @Column(name = "reason for cancellation")
    private String reasonForCancellation;//причина отмены в случае отмены

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Appointment_id")
    private Appointment appointment;

    public Event(){
    }

    public Event(Long idAppointment, Long idEvent, LocalDateTime dateTimeEvent, String typeProceduresOrMedicines,
                 String statusAppointment, String reasonForCancellation){
        this.idAppointment=idAppointment;
        this.idEvent=idEvent;
        this.dateTimeEvent=dateTimeEvent;
        this.typeProceduresOrMedicines=typeProceduresOrMedicines;
        this.statusAppointment=statusAppointment;
        this.reasonForCancellation=reasonForCancellation;
    }

}
