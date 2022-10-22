package com.usal.proyectoFinal.alerta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlertaRepository extends JpaRepository<Alerta,Long> {
    @Query(value = "SELECT * FROM alerta", nativeQuery = true)
    List<Alerta> findAllActiveAlertas();

}
