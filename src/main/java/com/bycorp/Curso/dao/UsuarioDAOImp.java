package com.bycorp.Curso.dao;

import com.bycorp.Curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(int id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {

    }
}
