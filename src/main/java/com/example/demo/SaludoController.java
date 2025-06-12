package com.example.demo;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
public class SaludoController {

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private EstudianteJPA estudianteJPA;

    @Value("${servicio}")
    private String variableServicio;

    @GetMapping("/saludo")
    public String saludar() {
        return "Hola mundo desde un contenedor";
    }

    @GetMapping("/despide")
    public String despedirse() {
        return "Fue un gusto";
    }

    @GetMapping("/guardar")
    public String guardar(@RequestParam String nombre) {
        log.info("Guarando estudiante");
        UUID uuid = UUID.randomUUID();
        estudianteJPA.save(new Estudiante(uuid.toString(), nombre));
        return "Estudiante Guardado exitosamente";
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> consultarEstudiantes() {
        log.info("Consultando estudiantes..");
        return estudianteJPA.findAll();
    }

    @GetMapping("/invocar")
    public String invocar() {
        log.info("Invocando servicio externo " + variableServicio);
        ResponseEntity<String> forEntity = restTemplate.getForEntity(variableServicio + "/pago", String.class);
        return forEntity.getBody();
    }
}
