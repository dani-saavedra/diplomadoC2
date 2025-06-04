package com.example.demo.unitest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaJPA extends JpaRepository<CuentaORM, String> {
}
