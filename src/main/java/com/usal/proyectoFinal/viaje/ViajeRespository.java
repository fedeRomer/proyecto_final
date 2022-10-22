package com.usal.proyectoFinal.viaje;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRespository extends JpaRepository<Viaje,Long> {
}
