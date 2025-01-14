package entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nombre;
    String apellido;
    String telefono;
    String dni;
    static public List<Cliente> listaClientes = new ArrayList<>();
    
    public Cliente() {}

    public Cliente(String nombre, String apellido, String telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
}
