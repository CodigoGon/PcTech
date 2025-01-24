package com.gamer.pctech.Repository;

import com.gamer.pctech.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM p WHERE p.tipo = :tipo")
    List<Producto> getProductosAll(String tipo);
}
