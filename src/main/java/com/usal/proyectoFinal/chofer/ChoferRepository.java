package com.usal.proyectoFinal.chofer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoferRepository extends JpaRepository<Chofer,Long> {
}
