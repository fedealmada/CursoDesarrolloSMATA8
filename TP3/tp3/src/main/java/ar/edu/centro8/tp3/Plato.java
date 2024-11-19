package ar.edu.centro8.tp3;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter @Getter
@NoArgsConstructor

public class Plato {
    private String numero;
    private String nombre;
    private int precio;
    private String descripcion;

    // Lista estática para almacenar platos
    static public List<Plato> platos = new ArrayList<>();
}
