package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "estudiante")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estudiante {

    @Id
    private String codigo;

    @Column
    private String nombre;
}
