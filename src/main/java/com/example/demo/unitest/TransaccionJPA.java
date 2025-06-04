package com.example.demo.unitest;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransaccionJPA extends JpaRepository<TransferenciaORM, String> {
}
