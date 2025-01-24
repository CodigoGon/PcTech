package com.gamer.pctech.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    @ManyToOne
    @JoinColumn(name = "clienteId")
    private Cliente unCliente;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;
    @OneToMany
    @JoinColumn(name = "IdPedidos")
    private List<Producto> listaProductos;
    private Double total;
    private Long puntosGamerTotal;
    private String estadoPedido;
    private String estadoPago;
}
