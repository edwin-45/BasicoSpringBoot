package com.spring.web.app.controller;

import com.spring.web.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/app")
public class IndexController {

    @RequestMapping({"/index","/",""})
    public String index(Model model){
        model.addAttribute("titulo","hola spring framework!!! Model");

        return "index";
    }


    @RequestMapping("/perfil")
    public String perfil (Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Edwin");
        usuario.setApellido("Torrado");
        usuario.setEmail("edwin@gmail.com");
        model.addAttribute("usuario",usuario);
        model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar (Model model) {


        model.addAttribute("titulo","Listado de usuario");


        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuario(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Edwin","Torrado","edwin@gmail.com"));
        usuarios.add(new Usuario("Fernando","Torrado","fernando@gmail.com"));
        usuarios.add(new Usuario("Laura","Torrado","laura@gmail.com"));

        return usuarios;
    }

}
