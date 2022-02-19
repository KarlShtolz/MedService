package com.example.medservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

//событие
@Data
@Entity
public class Event {
    @Id
    private Long idAppointment;
    private String statusAppointment;
    private String typeProceduresOrMedicines;
    private LocalDateTime dateEvent;
}
