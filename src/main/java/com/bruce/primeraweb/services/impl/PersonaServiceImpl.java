package com.bruce.primeraweb.services.impl;

import com.bruce.primeraweb.entities.Persona;
import com.bruce.primeraweb.repositories.PersonaRepository;
import com.bruce.primeraweb.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPorID(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona add) {
        return personaRepository.save(add);
    }

    @Override
    public Persona actualizarPersona(Persona upd) {
        return personaRepository.save(upd);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Long contarPersonas() {
        return personaRepository.count();
    }

}
