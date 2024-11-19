package ar.edu.centro8.tp4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.edu.centro8.tp4.entities.Cliente;

@Controller
public class ClienteController {

    @PostMapping("/cliente/mostrar")
    public void mostrarCliente(@RequestBody Cliente c) {
        System.out.println("Nombre: " + c.getNombre() + " Edad: " + c.getEdad());
    }

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        return "cliente";
    }



}
