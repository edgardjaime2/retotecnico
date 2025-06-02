package com.ejemplo.crud.service.impl;

import com.ejemplo.crud.entity.Estudiante;
import com.ejemplo.crud.entity.Usuario;
import com.ejemplo.crud.repository.EstudianteRepository;
import com.ejemplo.crud.service.EstudianteService;
import com.ejemplo.crud.util.ResponseGeneric;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;


import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl   implements EstudianteService {

    private final EstudianteRepository   estudianteRepository;



    @Override
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante obtenerId(Long id) {

        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public ResponseEntity<ResponseGeneric> crear(Estudiante estudiante) {
        Estudiante  estudianteFinal= estudianteRepository.save(estudiante);

        ResponseGeneric  data= new ResponseGeneric();
        data.setMessage("Estudiante registrado satisfactoriamente");
        data.setData(estudianteFinal);
        return new ResponseEntity<>(data, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ResponseGeneric> actualizar(Long id, Estudiante datos) {
        Estudiante estudiante = obtenerId(id);
        if (estudiante != null) {
            estudiante.setNombre(datos.getNombre());
            estudiante.setEmail(datos.getEmail());
            estudiante.setCreditos(datos.getCreditos());
            estudiante.setPromedio(datos.getPromedio());
            estudiante.setSemestre(datos.getSemestre());
            Estudiante estudianteFinal=  estudianteRepository.save(estudiante);

            ResponseGeneric  data= new ResponseGeneric();
            data.setMessage("Dato Actualizado Satisfactoriamente");
            data.setData(estudiante);

            return new ResponseEntity<>(data, HttpStatus.CREATED);
        }
        ResponseGeneric  data= new ResponseGeneric();
        data.setMessage("No se encontro registro de datos del estudiante");
        data.setData(estudiante);
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);

    }

    @Override
    public ResponseEntity<ResponseGeneric> eliminar(Long id) {

        estudianteRepository.deleteById(id);
        ResponseGeneric  data= new ResponseGeneric();
        data.setMessage("Dato Eliminado Satisfactoriamente");

        return new ResponseEntity<>(data, HttpStatus.OK);


    }
}
