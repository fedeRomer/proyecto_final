package com.usal.proyectoFinal.camion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //crossOrigin va para todos los controller
@RequestMapping("/api/camion")
public class CamionController {

    @Autowired
    private CamionService camionService;

    @Autowired
    public CamionController(CamionService camionService){
        this.camionService=camionService;
    }

    @GetMapping()
    public ResponseEntity<?> getCamion(@RequestBody Camion camion){
        return camionService.get(camion);
    }

    @PostMapping()
    public ResponseEntity<?> addCamion(@RequestBody Camion camion){
        return camionService.add(camion);
    }

    @PutMapping()
    public ResponseEntity<?> updateCamion(@RequestBody Camion camion){
        return camionService.update(camion);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        return camionService.getAll();
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteCamion(@RequestBody Camion camion){
        return camionService.delete(camion);
    }

}
