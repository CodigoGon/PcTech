package com.gamer.pctech.Repository;

import com.gamer.pctech.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
}
