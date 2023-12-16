package com.bruce.primeraweb.services;

import com.bruce.primeraweb.entities.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService
{
    List<Persona> obtenerTodas();

    Persona obtenerPorID(Long id);

    Persona crearPersona(Persona add);

    Persona actualizarPersona(Persona upd);

    void eliminarPersona(Long id);

    Long contarPersonas();
}
