package com.example.demo.unitest;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransferenciaService {


    private TransaccionJPA transaccionJPA;
    private CuentaJPA cuentaJPA;

    public TransferenciaService(TransaccionJPA transaccionJPA, CuentaJPA cuentaJPA) {
        this.transaccionJPA = transaccionJPA;
        this.cuentaJPA = cuentaJPA;
    }


    public void transferir(TransferenciaDTO dto) {
        Optional<CuentaORM> byId = cuentaJPA.findById(dto.origen());

        if (byId.isEmpty() || byId.get().saldo <= dto.monto()) {
            throw new IllegalArgumentException("Cuenta Inexistente o saldo Insuficiente");
        }

        if (dto.origen().equals(dto.destino())) {
            throw new IllegalArgumentException("No puede transferir ....");
        }

        if (dto.monto() <= 0) {
            throw new NegativeArraySizeException("Negativo....");
        }

        if (dto.monto() > 1000) {
            throw new IllegalArgumentException("El monto no puede ser mayor que 1000");
        }

        TransferenciaORM transferenciaORM = new TransferenciaORM(UUID.randomUUID().toString(), dto.origen(), dto.destino(), dto.monto(), LocalDateTime.now(),"localhost");
        transaccionJPA.save(transferenciaORM);
    }
    //Si algo es dificil de probar, problemente esta mal programado o puede mejorarse.


    public int calcularBonus(int diasExtras) {
        int bonus = 0;
        for (int i = 0; i < diasExtras; i++) {
            bonus += 1000;
        }
        return bonus;
    }

    public int saldoDescontar(int diasTarde) {
        return -5000 * diasTarde;
    }
}
