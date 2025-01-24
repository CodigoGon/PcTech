package com.gamer.pctech.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProducto;
    private String marca;
    private String modelo;
    private String tipo;
    private Long puntosGamerValor;
    private Double precio;
    private Long Stock;
    @ElementCollection
    private List<String> etiquetas;

}
