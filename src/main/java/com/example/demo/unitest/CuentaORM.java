package com.example.demo.unitest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuenta")
@Data
public class CuentaORM {

    @Id
    String cuenta;

    @Column
    int saldo;
}
