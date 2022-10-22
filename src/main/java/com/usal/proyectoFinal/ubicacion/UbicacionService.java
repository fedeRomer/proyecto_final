package com.usal.proyectoFinal.ubicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UbicacionService {

    @Autowired
    private UbicacionRepository ubicacionRepository;
    public ResponseEntity<?> get(Ubicacion ubicacion) {
        return new ResponseEntity<>(ubicacionRepository.getReferenceById(ubicacion.getId()), HttpStatus.OK);
    }

    public ResponseEntity<?> add(Ubicacion ubicacion) {
        return new ResponseEntity<>(ubicacionRepository.save(ubicacion), HttpStatus.OK);
    }

    public ResponseEntity<?> update(Ubicacion ubicacion) {
        return new ResponseEntity<>(ubicacionRepository.save(ubicacion), HttpStatus.OK);
    }
}
