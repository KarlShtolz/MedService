package com.example.medservice.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;

//процедуры и лекарства
@Data
@Entity
public class ProceduresAndMedicines {
    private String nameProceduresAndMedicines;
    private String typeProceduresOrMedicines;
}
