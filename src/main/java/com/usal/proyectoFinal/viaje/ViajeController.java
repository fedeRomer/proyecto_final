package com.usal.proyectoFinal.viaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //crossOrigin va para todos los controller
@RequestMapping("/api/viaje")
public class ViajeController {

    @Autowired
    private ViajeService viajeService;

    @Autowired
    public ViajeController(ViajeService viajeService) {
        this.viajeService = viajeService;
    }

    @GetMapping()
    public ResponseEntity<?> get(@RequestBody Viaje viaje) {
        return viajeService.get(viaje);
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody Viaje viaje) {
        return viajeService.add(viaje);
    }

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Viaje viaje) {
        return viajeService.update(viaje);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll() {
        return viajeService.getAll();
    }

}
