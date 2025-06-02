package com.ejemplo.crud.service;

import com.ejemplo.crud.entity.Estudiante;
import com.ejemplo.crud.entity.Usuario;
import com.ejemplo.crud.util.ResponseGeneric;



import java.util.List;
import org.springframework.http.ResponseEntity;

public interface EstudianteService {

    public List<Estudiante> listar();
    public Estudiante obtenerId(Long id);
    public ResponseEntity<ResponseGeneric> crear(Estudiante estudiante);
    public ResponseEntity<ResponseGeneric> actualizar(Long id, Estudiante datos);
    public ResponseEntity<ResponseGeneric> eliminar(Long id);
}
