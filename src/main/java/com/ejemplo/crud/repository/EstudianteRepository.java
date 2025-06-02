package com.ejemplo.crud.repository;

import com.ejemplo.crud.entity.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository  extends JpaRepository<Estudiante, Long> {
}
