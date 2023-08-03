/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.sena.colegioweb.servlets;

import co.edu.sena.colegioweb.logica.Controladora;
import co.edu.sena.colegioweb.logica.Estudiante;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEstudiante", urlPatterns = {"/SvEstudiante"})
public class SvEstudiante extends HttpServlet {
    
    Controladora controladora= new Controladora();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Estudiante>estudiantes = new ArrayList<>();
        
        estudiantes= controladora.listarEstudiantes();
        
        HttpSession sesion=request.getSession();
        sesion.setAttribute("listaEstudiantes", estudiantes);
        
        response.sendRedirect("listar.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int codigo= Integer.parseInt(request.getParameter("codigo"));
        String nombre= request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        int edad=Integer.parseInt(request.getParameter("edad"));
                
        
           Estudiante e = new Estudiante();
           
           e.setCodigo(codigo);
           e.setNombre(nombre);
           e.setApellido(apellido);
           e.setEdad(edad);
           
           
           controladora.registrarEstudiante(e);
           
           response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}