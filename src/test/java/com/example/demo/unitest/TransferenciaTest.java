package com.example.demo.unitest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
/*
@ExtendWith(MockitoExtension.class)
class TransferenciaTest {

    @Mock
    TransferenciaDB db;

    @Mock
    CuentaDB cuentaDB;

    @InjectMocks
    TransferenciaService transferenciaService;

    //Lo que queremos representar nosotros con nuestras pruebas
    //es esa logica de negocio que queremos que se cumpla.
    @Test
    void DadoDestinoInvalido_CuandoTransfiera_EntoncesArrojaException() {
        //Arrange

        Mockito.when(cuentaDB.obtenerSaldoCuenta("ABC")).thenReturn(100);

        TransferenciaDTO dto = new TransferenciaDTO("ABC", "ABC", 1);
        //Act
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaService.transferir(dto)
        );
        //Verificar

    }

    @Test
    void MontoInferior_CuandoEsMenorACero_ArrojaException() {
        Mockito.when(cuentaDB.obtenerSaldoCuenta("ABC")).thenReturn(100);
        TransferenciaDTO dto = new TransferenciaDTO("ABC", "BCA", 0);

        Assertions.assertThrows(NegativeArraySizeException.class,
                () -> transferenciaService.transferir(dto)
        );
    }

    @Test
    void MontoSuperiorAlPermitido_CuandoRealizaTransferencia_ArrojaException() {
        Mockito.when(cuentaDB.obtenerSaldoCuenta("ABC")).thenReturn(100);

        TransferenciaDTO dto = new TransferenciaDTO("ABC", "BCD", 1001);

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaService.transferir(dto)
        );
    }

    @Test
    void test_transferencia_exitosa() {
        Mockito.when(cuentaDB.obtenerSaldoCuenta("ABC")).thenReturn(1001);
        TransferenciaDTO dto = new TransferenciaDTO("ABC", "BCD", 1000);
        transferenciaService.transferir(dto);

        Mockito.verify(db).guardarDB(Mockito.any());
    }

    @Test
    void test1() {
        int resultado = transferenciaService.calcularBonus(10);

        Assertions.assertEquals(10000, resultado);
    }

    @Test
    void test2() {
        int resultado = transferenciaService.saldoDescontar(3);

        Assertions.assertEquals(-15000, resultado);
    }

    @Test
    void test_sin_dias_retraso() {
        int resultado = transferenciaService.saldoDescontar(0);

        Assertions.assertEquals(0, resultado);
    }

}

 */