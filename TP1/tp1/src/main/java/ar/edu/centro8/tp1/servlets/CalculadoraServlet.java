package ar.edu.centro8.tp1.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "calculadora", urlPatterns = "/calculadora")
public class CalculadoraServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int num1 = Integer.parseInt(req.getParameter("valor1"));
        int num2 = Integer.parseInt(req.getParameter("valor2"));
        String op = req.getParameter("op");
        int resultado;
        
        switch (op) {
            case "*":
                resultado = (int)(num1 * num2);
                resp.getWriter().println("El resultado es: " + resultado);
                break;
            case "/":
                if(num2==0){
                    resp.getWriter().println("Error: el divisor no debe ser cero.");
                }else{
                resultado = (num1 / num2);
                resp.getWriter().println("El resultado es: " + resultado);
                }
                break;
            case "-":
                resultado = (num1 - num2);
                resp.getWriter().println("El resultado es: " + resultado);
                break;
            case "+":
                resultado = (num1 + num2);
                resp.getWriter().println("El resultado es: " + resultado);
                break;
            }
        }
    }
