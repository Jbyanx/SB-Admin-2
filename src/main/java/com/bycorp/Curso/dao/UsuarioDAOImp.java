package com.bycorp.Curso.dao;

import com.bycorp.Curso.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDAOImp implements UsuarioDAO {

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}
