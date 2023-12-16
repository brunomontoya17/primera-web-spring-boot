package com.bruce.primeraweb.controllers;

import com.bruce.primeraweb.entities.Persona;
import com.bruce.primeraweb.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    //La clase model transfiere objetos del controlador a la vista
    @GetMapping
    public String listarPersonas(Model model)
    {
        List<Persona> listaPersonas = personaService.obtenerTodas();
        model.addAttribute("listaPersonas",listaPersonas);
        return "listar";
    }

    @GetMapping("/agregar")
    public String formularioAgregarPersona (Model model)
    {
        model.addAttribute("persona",new Persona());
        model.addAttribute("accion","/personas/agregar");
        return "crear";
    }

    @PostMapping("/agregar")
    public String guardarPersona (@ModelAttribute Persona persona)
    {
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/modificar/{id}")
    public String formularioModificarPersona (@PathVariable Long id, @ModelAttribute Persona persona, Model model)
    {
        model.addAttribute("persona",persona);
        model.addAttribute("accion","/personas/modificar/"+id);
        return "crear";
    }

    @PostMapping("/modificar/{id}")
    public String actualizarPersona (@PathVariable Long id,@ModelAttribute Persona persona)
    {
        personaService.actualizarPersona(persona);
        return "redirect:/personas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPersona (@PathVariable Long id)
    {
        personaService.eliminarPersona(id);
        return "redirect:/personas";
    }
}
