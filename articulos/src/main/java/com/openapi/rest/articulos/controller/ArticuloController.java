package com.openapi.rest.articulos.controller;

import com.openapi.rest.articulos.model.Articulo;
import com.openapi.rest.articulos.model.ArticuloUpdate;
import com.openapi.rest.articulos.service.ArticuloService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    private final ArticuloService service;

    public ArticuloController(ArticuloService service) {
        this.service = service;
    }

    @GetMapping("/getItem/{id}")
    public ResponseEntity<?> obtenerArticulo(@PathVariable String id) {
        Optional<Articulo> articulo = service.obtenerArticulo(id);
        return articulo.map(ResponseEntity::ok)
                       .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/updateItem/{id}")
    public ResponseEntity<?> actualizarArticulo(@PathVariable String id,
                                                @RequestBody @Valid ArticuloUpdate updateData) {
        Optional<Articulo> actualizado = service.actualizarArticulo(id, updateData);
        return actualizado.map(ResponseEntity::ok)
                          .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
