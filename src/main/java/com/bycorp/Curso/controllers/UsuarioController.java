package com.bycorp.Curso.controllers;

import com.bycorp.Curso.dao.UsuarioDAO;
import com.bycorp.Curso.dao.UsuarioDAOImp;
import com.bycorp.Curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDAO usuarioDAO;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDAO.getUsuarios();
    }


    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
        usuarioDAO.registrar(usuario);
    }



    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable int id){
        usuarioDAO.eliminar(id);
    }

}
