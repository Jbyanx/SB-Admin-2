package com.bycorp.Curso.dao;

import com.bycorp.Curso.models.Usuario;

import java.util.List;

public interface UsuarioDAO {
    List<Usuario> getUsuarios();

    void eliminar(int id);

    void registrar(Usuario usuario);
}
