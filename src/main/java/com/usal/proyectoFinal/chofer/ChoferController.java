package com.usal.proyectoFinal.chofer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //crossOrigin va para todos los controller
@RequestMapping("/api/chofer")
public class ChoferController {

    @Autowired
    private ChoferService choferService;

    @Autowired
    private ChoferController(ChoferService choferService){
        this.choferService=choferService;
    }

    @GetMapping()
    public ResponseEntity<?> get(@RequestBody Chofer chofer){
        return choferService.get(chofer);
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody Chofer chofer){
        return choferService.add(chofer);
    }

    @PutMapping()
    public ResponseEntity<?> update(@RequestBody Chofer chofer){
        return choferService.update(chofer);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        return choferService.getAll();
    }

    @DeleteMapping()
    public ResponseEntity<?> delete(@RequestBody Chofer chofer){
        return choferService.delete(chofer);
    }
}
