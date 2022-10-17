package com.usal.proyectoFinal.alerta;

import com.usal.proyectoFinal.util.ResponseCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertaService {

    @Autowired
    private AlertaRepository alertaRepository;


    ResponseCustom responseCustom = new ResponseCustom();

    public ResponseEntity<?> getAlerta(Alerta alerta) {
        List<Alerta> alertaList = new ArrayList<>();

        if (alerta.getId() != null) {

            alertaList = alertaRepository.findAll();
            if (!alertaList.isEmpty()) {
                return new ResponseEntity<>(alertaList, HttpStatus.OK);
            } else {
                return ResponseEntity.badRequest().body("No se encontraron resultados");
            }
        } else {
            return ResponseEntity.badRequest().body("Se requiere ID para esta operación");
        }

    }

    public ResponseEntity<?> getAllAlertas() {

        List<Alerta> alertaList = new ArrayList<>();

        alertaList = alertaRepository.findAll();

        if (!alertaList.isEmpty()) {
            return new ResponseEntity<>(alertaList, HttpStatus.OK);
        } else {
            return ResponseEntity.badRequest().body("No se encontraron resultados");
        }
    }

    public ResponseEntity<?> addAlerta(Alerta alerta) {
        alertaRepository.save(alerta);
        return new ResponseEntity<String>("Operación exitosa", HttpStatus.OK);
    }

    public ResponseEntity<?> updateAlerta(Alerta alerta) {

        if (alerta.getId() == null) {
            return ResponseEntity.badRequest().body("Se necesita el ID del alerta para modificar");
        }

        alertaRepository.save(alerta);
        return new ResponseEntity<>("Alerta modificada", HttpStatus.OK);
    }

    public ResponseEntity<?> deleteAlerta(Alerta alerta) {

        if (alerta.getId() == null) {
            return ResponseEntity.badRequest().body("Se necesita el ID del alerta para modificar");
        }

        alertaRepository.deleteById(alerta.getId());
        return new ResponseEntity<>("Alerta eliminada exitosamente", HttpStatus.OK);
    }

    public ResponseEntity<?> getAllActiveAlerts() {
        List<Alerta> alertaList = new ArrayList<>();

        try {
            alertaList = alertaRepository.findAllActiveAlertas();

        } catch (Exception e) {
            responseCustom.setResponse("ocurrió un error en la busqueda de alertas");
            return new ResponseEntity<>(responseCustom, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(alertaList, HttpStatus.OK);
    }
}
