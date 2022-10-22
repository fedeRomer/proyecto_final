package com.usal.proyectoFinal.viaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ViajeService {

    @Autowired
    private ViajeRespository viajeRespository;

    public ResponseEntity<?> add(Viaje viaje) {
        return new ResponseEntity<>(viajeRespository.save(viaje), HttpStatus.OK);
    }

    public ResponseEntity<?> update(Viaje viaje) {
        return new ResponseEntity<>(viajeRespository.save(viaje), HttpStatus.OK);
    }

    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(viajeRespository.findAll(),HttpStatus.OK);
    }

    public ResponseEntity<?> get(Viaje viaje) {
        return new ResponseEntity<>(viajeRespository.getReferenceById(viaje.getId()),HttpStatus.OK);
    }
}
