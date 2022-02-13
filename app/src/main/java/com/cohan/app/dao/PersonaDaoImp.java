package com.cohan.app.dao;

import com.cohan.app.models.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
/*Clase que realiza consulta CRUD a la BD*/
public class PersonaDaoImp implements PersonaDao{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Persona> getPersona()
    {
        String query = "FROM Persona per, Direccion dir WHERE per.id = dir.id";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void Eliminar(Long id) {
        Persona persona = entityManager.find(Persona.class, id);
        entityManager.remove(persona);
    }

    @Override
    public void registrar(Persona persona) {
        entityManager.merge(persona);
    }
}
