package com.ejemplo.crud.controller;

import com.ejemplo.crud.entity.Estudiante;
import com.ejemplo.crud.entity.Usuario;
import com.ejemplo.crud.service.EstudianteService;
import com.ejemplo.crud.service.impl.UsuarioServiceImpl;
import com.ejemplo.crud.util.CommonApiResponses;
import com.ejemplo.crud.util.ResponseGeneric;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    private final EstudianteService  service;

    @Operation(summary = "Listar Estudiantes.",
            description = "Listar Estudiantes. ",
            tags = {"EstudianteController"})
    @CommonApiResponses
    @GetMapping
    public List<Estudiante> listar() {
        return service.listar();
    }

    @Operation(summary = "Obtener Estudiante por id.",
            description = "Obtener Estudiante por id. ",
            tags = {"EstudianteController"})
    @CommonApiResponses
    @GetMapping("/{codigo}")
    public Estudiante obtener(@PathVariable(value = "codigo", required = true) Long codigo) {

        return service.obtenerId(codigo);
    }

    @Operation(summary = "Crear Estudiante",
            description = "Crear Estudiante ",
            tags = {"EstudianteController"})
    @CommonApiResponses
    @PostMapping
    public ResponseEntity<ResponseGeneric> crear(@RequestBody Estudiante estudiante) {
        return service.crear(estudiante);
    }

    @Operation(summary = "Actualizar Estudiante",
            description = "Actualizar Estudiante ",
            tags = {"EstudianteController"})
    @PutMapping("/{codigo}")
    public ResponseEntity<ResponseGeneric> actualizar(@PathVariable(value = "codigo", required = true) Long codigo, @RequestBody Estudiante estudiante) {
        return service.actualizar(codigo, estudiante);
    }
    @Operation(summary = "Eliminar Estudiante",
            description = "Eliminar Estudiante ",
            tags = {"EstudianteController"})
    @DeleteMapping("/{codigo}")
    public ResponseEntity<ResponseGeneric> eliminar(@PathVariable(value = "codigo", required = true) Long codigo) {
      return    service.eliminar(codigo);
    }
}
