package com.usal.proyectoFinal.camion;

import com.usal.proyectoFinal.ubicacion.Ubicacion;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "camion")
public class Camion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String marcaModelo;

    @Column
    private String estado;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ubicacion_fk")
    private Ubicacion ubicacion;
}
