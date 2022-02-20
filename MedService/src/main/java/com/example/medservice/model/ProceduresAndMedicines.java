package com.example.medservice.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//процедуры и лекарства
@Data
@Entity
@Table(name="ProcedureAndMedicine")
public class ProceduresAndMedicines {
    @Id
    @Column(name="idProceduresAndMedicines")
    private Long idProceduresAndMedicines;

    @Column(name="nameProceduresAndMedicines")
    private String nameProceduresAndMedicines;

    @Column(name="typeProceduresOrMedicines")
    private String typeProceduresOrMedicines;
}
//вероятно, что название и тип - это выглядит так
// название - Phenobarbitalum (lat.)
//тип - противосудорожное, седативное, снотворное
