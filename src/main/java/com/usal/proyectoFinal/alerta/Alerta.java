package com.usal.proyectoFinal.alerta;

import com.usal.proyectoFinal.camion.Camion;
import com.usal.proyectoFinal.chofer.Chofer;
import com.usal.proyectoFinal.ubicacion.Ubicacion;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@Table(name = "alerta")
public class Alerta implements Serializable {

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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ubicacion_alerta_fk")
    private Ubicacion ubicacion;

    @Column(name = "tipo_alerta")
    private String tipoAlerta;
    @Column(name = "detale")
    private String detalle;


}
