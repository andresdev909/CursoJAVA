package com.cohan.app.controllers;

import com.cohan.app.dao.PersonaDao;
import com.cohan.app.models.Direccion;
import com.cohan.app.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioControllers {

    @Autowired
    private PersonaDao personaDao;

    @RequestMapping(value = "persona", method = RequestMethod.GET)
    public List<Persona> getPersona()
    {
        return personaDao.getPersona();
    }

    @RequestMapping(value = "persona", method = RequestMethod.POST)
    public void registrarPersona(@RequestBody Persona persona)
    {
        personaDao.registrar(persona);
    }

    @RequestMapping(value = "persona/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id)
    {
        personaDao.Eliminar(id);
    }
}
