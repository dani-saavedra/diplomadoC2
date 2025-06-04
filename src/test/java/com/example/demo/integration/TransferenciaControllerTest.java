package com.example.demo.integration;

import com.example.demo.unitest.TransferenciaDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
/*
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TransferenciaControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testTransferencia() {
        TransferenciaDTO dto = new TransferenciaDTO("1", "2", 10);
        ResponseEntity<String> response = restTemplate.postForEntity("/api/transferencia", dto, String.class);
        Assertions.assertEquals(200, response.getStatusCodeValue());
        Assertions.assertEquals("Ok", response.getBody());
    }
    //Si funciona a la primera, es un video.
}

 */
