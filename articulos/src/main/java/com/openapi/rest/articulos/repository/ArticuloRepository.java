package com.openapi.rest.articulos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openapi.rest.articulos.model.Articulo;

public interface ArticuloRepository extends JpaRepository<Articulo, String> {
}
