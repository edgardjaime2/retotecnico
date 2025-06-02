package com.ejemplo.crud.service.impl;

import com.ejemplo.crud.entity.Usuario;
import com.ejemplo.crud.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class UsuarioServiceImpl {

    private final UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listar() {
        return repository.findAll();
    }

    public Usuario obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario actualizar(Long id, Usuario datos) {
        Usuario usuario = obtener(id);
        if (usuario != null) {
            usuario.setNombre(datos.getNombre());
            usuario.setEmail(datos.getEmail());
            return repository.save(usuario);
        }
        return null;
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
