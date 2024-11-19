package ar.edu.centro8.tp1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "auto", urlPatterns = "/auto")
public class AutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String marca = req.getParameter("marca");
        int modelo = (int) Integer.parseInt(req.getParameter("modelo"));

        String[] marcas = {"Ford", "Fiat", "BMW", "Ferrari"};

        // Flag para verificar si los datos son válidos (por defecto en falso)
        boolean flag = false;

        // Recorrido para verificar si la marca está dentro del listado de marcas.
        for (int i = 0; i < marcas.length; i++) {

            // Si la marca está dentro de las marcas.
            if(marcas[i].equals(marca)) {
                flag = true;
            } else {
                flag = false;
            }
        }

        // Si el modelo del auto tiene más de 10 años de antiguedad.
        if(2024 - modelo >= 10) {
            flag = false;
        }

        // Si el modelo es del futuro.
        if(modelo > 2024) {
            flag = false;
        }

        // Si la verificación no tuvo errores entonces se imprimen los datos, de lo contrario, se imprime un error.
        if(flag) {
            resp.getWriter().println("La marca es: " + marca + " y el modelo es del año " + modelo + " (antiguedad = " + (2024 - modelo) + ")");
        } else {
            resp.getWriter().println("Error");
        }
    }
}
