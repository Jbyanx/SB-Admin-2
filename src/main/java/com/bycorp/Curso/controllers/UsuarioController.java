package com.bycorp.Curso.controllers;

import com.bycorp.Curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {



    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> lista = new ArrayList<>();

        // Usuario 1
        Usuario u1 = new Usuario();
        u1.setId(12);
        u1.setNombre("Jabes");
        u1.setApellido("Borre");
        u1.setTelefono("1212121212");
        u1.setEmail("jabes@email.com");
        lista.add(u1);

        // Usuario 2
        Usuario u2 = new Usuario();
        u2.setId(23);
        u2.setNombre("Juan");
        u2.setApellido("Pérez");
        u2.setTelefono("3333333333");
        u2.setEmail("juan@email.com");
        lista.add(u2);

        // Usuario 3
        Usuario u3 = new Usuario();
        u3.setId(34);
        u3.setNombre("María");
        u3.setApellido("López");
        u3.setTelefono("5555555555");
        u3.setEmail("maria@email.com");
        lista.add(u3);

        // Usuario 4
        Usuario u4 = new Usuario();
        u4.setId(45);
        u4.setNombre("Pedro");
        u4.setApellido("García");
        u4.setTelefono("7777777777");
        u4.setEmail("pedro@email.com");
        lista.add(u4);

        return lista;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        Usuario usr = new Usuario();
        usr.setId(id);
        usr.setNombre("Pedro");
        usr.setApellido("Navaja");
        usr.setEmail("pedro@email.com");
        usr.setTelefono("3213123212");
        usr.setPassword("tajada");
        return usr;
    }

    @RequestMapping(value = "usuariosadasdg")
    public Usuario editar(){
        Usuario u1 = new Usuario();
        u1.setNombre("Jabes");
        u1.setApellido("Borre");
        u1.setTelefono("1212121212");
        u1.setEmail("jabes@email.com");
        return u1;
    }


    @RequestMapping(value = "usuariodfg")
    public Usuario eliminar(){
        Usuario u1 = new Usuario();
        u1.setNombre("Jabes");
        u1.setApellido("Borre");
        u1.setTelefono("1212121212");
        u1.setEmail("jabes@email.com");
        return u1;
    }


    @RequestMapping(value = "usuario3445")
    public Usuario buscar(){
        Usuario u1 = new Usuario();
        u1.setNombre("Jabes");
        u1.setApellido("Borre");
        u1.setTelefono("1212121212");
        u1.setEmail("jabes@email.com");
        return u1;
    }
}
