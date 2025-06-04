package com.example.demo.unitest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transferencia")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferenciaORM {
    @Id
    String uuid;

    @Column
    String origen;
    @Column
    String destino;
    @Column
    int monto;
    @Column
    LocalDateTime fechaTransferencia;

    @Column
    String ip;
}
