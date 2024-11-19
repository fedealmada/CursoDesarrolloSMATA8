/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import entities.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feede
 */
@WebServlet(name = "SvPrueba", urlPatterns = {"/SvPrueba"})
public class SvPrueba extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 

        // si no hay clientes todavía creo un par para que la lista no esté null
        if(Cliente.listaClientes.size() == 0) {
            Cliente c1 = new Cliente("Robert", "De Niro", "11-3255-2323", "21.162.372");
            Cliente c2 = new Cliente("Nicky", "Nicole", "11-2429-3126", "42.285.231");
            Cliente.listaClientes.add(c1);
            Cliente.listaClientes.add(c2);
        }  
        
        // seteamos la lista de clientes como un parámetro
        // para poder utilizar el cualquier JSP
        // para ello traemos la sesión de la request
        
        HttpSession misession = request.getSession();
        misession.setAttribute("listaClientes", Cliente.listaClientes);
        

        
        // redireccionamos a otro JSP
        response.sendRedirect("MostrarJSP.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // traemos los datos enviados en la request
        // los guardamos en variables auxiliares
        // el nombre en getParameter debe ser el mismo que en el input del form
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        // creo un nuevo cliente con los datos del formulario
        // y lo agrego a la lista de clientes
        
        Cliente nuevoCliente = new Cliente(nombre, apellido, telefono, dni);
        Cliente.listaClientes.add(nuevoCliente);
        
        response.sendRedirect("MostrarJSP.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
