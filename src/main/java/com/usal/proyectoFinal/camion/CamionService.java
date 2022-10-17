package com.usal.proyectoFinal.camion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CamionService {

    @Autowired
    private CamionRepository camionRepository;

    public ResponseEntity<?> get(Camion camion) {
        return new ResponseEntity<>(camionRepository.getReferenceById(camion.getId()), HttpStatus.OK);
    }

    public ResponseEntity<?> add(Camion camion) {
        camionRepository.save(camion);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    public ResponseEntity<?> update(Camion camion) {
        camionRepository.save(camion);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(camionRepository.findAll(),HttpStatus.OK);
    }

    public ResponseEntity<?> delete(Camion camion) {
        camionRepository.delete(camion);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }
}
