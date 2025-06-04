package com.example.demo.unitest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class TransferenciaController {

    TransferenciaService service;

    public TransferenciaController(TransferenciaService service) {
        this.service = service;
    }

    @PostMapping("/transferencia")
    public String transferir(@RequestBody TransferenciaDTO transferenciaDTO) {
        log.info("realizando transferencia con DTO: {}", transferenciaDTO);
        service.transferir(transferenciaDTO);
        return "Ok";
    }
}
