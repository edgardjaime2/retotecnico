package com.ejemplo.crud.controller;

import com.ejemplo.crud.entity.Usuario;
import com.ejemplo.crud.service.impl.UsuarioServiceImpl;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioServiceImpl service;

    public UsuarioController(UsuarioServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @GetMapping("/{codigo}")
    public Usuario obtener(@PathVariable(value = "codigo", required = true) Long codigo) {

        return service.obtener(codigo);
    }

    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
        return service.actualizar(id, usuario);
    }

    @PutMapping("/elimina/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
