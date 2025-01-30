package com.openapi.rest.articulos.service;

import com.openapi.rest.articulos.model.Articulo;
import com.openapi.rest.articulos.model.ArticuloUpdate;
import com.openapi.rest.articulos.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ArticuloService {

    @Autowired
    private ArticuloRepository repository;

    public Optional<Articulo> obtenerArticulo(String id) {
        return repository.findById(id);
    }

    public Optional<Articulo> actualizarArticulo(String id, ArticuloUpdate updateData) {
        return repository.findById(id).map(articulo -> {
            if (updateData.getDescripcion() != null) {
                articulo.setDescripcion(updateData.getDescripcion());
            }
            if (updateData.getModelo() != null) {
                articulo.setModelo(updateData.getModelo());
            }
            return repository.save(articulo);
        });
    }
}
