package com.usal.proyectoFinal.alerta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //crossOrigin va para todos los controller
@RequestMapping("/api/alerta")
public class AlertaController {


    @Autowired
    private AlertaService alertaService;

    @Autowired
    public AlertaController(AlertaService alertaService){
        this.alertaService=alertaService;
    }

    @GetMapping()
    public ResponseEntity<?> getAlerta(@RequestBody Alerta alerta){
        return alertaService.getAlerta(alerta);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getAllAlerta(){
        return alertaService.getAllAlertas();
    }

    @PostMapping("/addalerta")
    public ResponseEntity<?> addAlerta(@RequestBody Alerta alerta){
        return alertaService.addAlerta(alerta);
    }

    @PutMapping("/updatealerta")
    public ResponseEntity<?> updateAlerta(@RequestBody Alerta alerta){
        return alertaService.updateAlerta(alerta);
    }

    @GetMapping("/getallactivealerts")
    public ResponseEntity<?> getAllActiveAlerts(){
        return alertaService.getAllActiveAlerts();
    }
    @DeleteMapping("/deletealerta")
    public ResponseEntity<?> deleteAlerta(@RequestBody Alerta alerta){
        return alertaService.deleteAlerta(alerta);
    }

}
