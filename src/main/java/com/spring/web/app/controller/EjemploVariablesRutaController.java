package com.spring.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")

public class EjemploVariablesRutaController {


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo","uso de pathvariable");
        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model){
        model.addAttribute("resultado","el texto es: "+texto);
        return "variables/ver";

    }


    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model){
        model.addAttribute("resultado","el texto es: "+texto + "el numero en el path es: "+ numero);
        return "variables/ver";

    }
}
