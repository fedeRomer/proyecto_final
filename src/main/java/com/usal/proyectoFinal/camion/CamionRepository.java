package com.usal.proyectoFinal.camion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamionRepository extends JpaRepository<Camion,Long> {
}
