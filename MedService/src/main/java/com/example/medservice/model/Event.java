package com.example.medservice.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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

    @Column(name="statusAppointment")
    private String statusAppointment;//статус: выполнен/не выполнен/отменено

    @Column(name="typeProceduresOrMedicines")
    private String typeProceduresOrMedicines;//тип процедуры или лекарства

    @Column(name="dateTimeEvent")
    private LocalDateTime dateTimeEvent;//дата и время события
}
