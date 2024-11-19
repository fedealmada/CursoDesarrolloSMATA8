package ar.edu.centro8.tp3.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.centro8.tp3.Paciente;

@RestController
@RequestMapping("/api")

public class PacienteController {

    @GetMapping("/paciente/listado")
    public List<Paciente> listarPacientes() {
        // Si no hay pacientes creamos 5 inicialmente.
        if (Paciente.pacientes.size() == 0) {
            Paciente p1 = new Paciente(1L, "41123232", "Fabricio", "Pereyra", LocalDate.of(2015, 2, 2));
            Paciente p2 = new Paciente(2L, "36444713", "Hernan", "Godin", LocalDate.of(1998, 4, 25));
            Paciente p3 = new Paciente(3L, "55984828", "Merlina", "Merlusa", LocalDate.of(1990, 12, 4));
            Paciente p4 = new Paciente(4L, "36444713", "Robert", "De Niro", LocalDate.of(1958, 4, 25));
            Paciente p5 = new Paciente(5L, "85974818", "Cecilia", "Rojas", LocalDate.of(2010, 1, 31));
            Paciente.pacientes.add(p1);
            Paciente.pacientes.add(p2);
            Paciente.pacientes.add(p3);
            Paciente.pacientes.add(p4);
            Paciente.pacientes.add(p5);
        }
        return Paciente.pacientes;
    }

    @GetMapping("/paciente/menores")
    public List<Paciente> listarPacientesMenores() {
        // Si no hay pacientes creamos 5 inicialmente.
        if (Paciente.pacientes.size() == 0) {
            Paciente p1 = new Paciente(1L, "41123232", "Fabricio", "Pereyra", LocalDate.of(2015, 2, 2));
            Paciente p2 = new Paciente(2L, "36444713", "Hernan", "Godin", LocalDate.of(1998, 4, 25));
            Paciente p3 = new Paciente(3L, "55984828", "Merlina", "Merlusa", LocalDate.of(1990, 12, 4));
            Paciente p4 = new Paciente(4L, "36444713", "Robert", "De Niro", LocalDate.of(1958, 4, 25));
            Paciente p5 = new Paciente(5L, "85974818", "Cecilia", "Rojas", LocalDate.of(2010, 1, 31));
            Paciente.pacientes.add(p1);
            Paciente.pacientes.add(p2);
            Paciente.pacientes.add(p3);
            Paciente.pacientes.add(p4);
            Paciente.pacientes.add(p5);
        }

        // Lista para pacientes menores de edad.
        ArrayList<Paciente> pacientesMenores = new ArrayList<>();

        // Bucle que recorre cada paciente y añade en la lista de menores a los que tienen
        // menos de 18 años.
        for (Paciente paciente : Paciente.pacientes) {
            LocalDate fechaHoy = LocalDate.now();
            LocalDate otraFecha = paciente.getFechaNacimiento();

            Period periodo = Period.between(otraFecha, fechaHoy);

            if (periodo.getYears() < 18) {
                pacientesMenores.add(paciente);
            }
        }
        return pacientesMenores;
    }
}
