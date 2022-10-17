package com.usal.proyectoFinal.ubicacion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //crossOrigin va para todos los controller
@RequestMapping("/api/ubicacion")
public class UbicacionController {

    @Autowired
    private UbicacionService ubicacionService;

    @Autowired
    private UbicacionController(UbicacionService ubicacionService){
        this.ubicacionService=ubicacionService;
    }

    @GetMapping()
    public ResponseEntity<?> get(@RequestBody Ubicacion ubicacion){
        return ubicacionService.get(ubicacion);
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody Ubicacion ubicacion{
        return ubicacionService.add(ubicacion);
    }

    @PutMapping()
    public ResponseEntity<?> get(@RequestBody Ubicacion ubicacion){
        return ubicacionService.update(ubicacion);
    }

}
