package ar.edu.centro8.tp3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.centro8.tp3.Plato;

@RestController
@RequestMapping("/api")
public class PlatoController {

    @GetMapping("/plato/{numero}")
    public Plato mostrarPlato(@PathVariable(name = "numero") String numero) {

        // Si la lista de platos está vacía entonces creamos algunas instancias.
        if (Plato.platos.size() == 0) {
            Plato p1 = new Plato("1", "Milanesa", 3300, "Sin descripción");
            Plato p2 = new Plato("2", "Pizza", 5000, "Sin descripción");
            Plato p3 = new Plato("3", "Fideos", 2600, "Sin descripción");
            Plato p4 = new Plato("4", "Arroz", 1400, "Sin descripción");
            Plato p5 = new Plato("5", "Asado", 6000, "Sin descripción");
            Plato.platos.add(p1);
            Plato.platos.add(p2);
            Plato.platos.add(p3);
            Plato.platos.add(p4);
            Plato.platos.add(p5);
        }

        // Bucle que chequea si el número de alguno de los platos coincide con el número
        // Pasado por parámetro.
        for (Plato plato : Plato.platos) {
            if (plato.getNumero().equals(numero)) {
                return plato;
            }
        }
        return null;
    }
}
