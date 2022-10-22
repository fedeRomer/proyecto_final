package com.usal.proyectoFinal.chofer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ChoferService {

    @Autowired
    private ChoferRepository choferRepository;

    public ResponseEntity<?> get(Chofer chofer) {
        return new ResponseEntity<>(choferRepository.getReferenceById(chofer.getId()), HttpStatus.OK);
    }

    public ResponseEntity<?> add(Chofer chofer) {
        return new ResponseEntity<>(choferRepository.save(chofer),HttpStatus.OK);
    }

    public ResponseEntity<?> update(Chofer chofer) {
        return new ResponseEntity<>(choferRepository.save(chofer), HttpStatus.OK);
    }

    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(choferRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<?> delete(Chofer chofer) {
        choferRepository.delete(chofer);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }
}
