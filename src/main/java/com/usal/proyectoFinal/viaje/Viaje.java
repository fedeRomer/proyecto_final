package com.usal.proyectoFinal.viaje;

import com.usal.proyectoFinal.camion.Camion;
import com.usal.proyectoFinal.chofer.Chofer;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "viaje")
public class Viaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "camion_fk")
    private Camion camion;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "chofer_fk")
    private Chofer chofer;

    @Column(name ="origen")
    private String origen;

    @Column(name="destino")
    private String destino;

    @Column(name ="detalle")
    private String detalle;
}
