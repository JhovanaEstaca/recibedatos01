
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {


  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // recibo datos del formulario
        String nombre= request.getParameter("nombre");
        String telefono=request.getParameter("telefono");
        String Correo=request.getParameter("correo");
        //instarnciar un objeto a partir de la clase persona
        Persona per=new Persona();
        //Encapsular los datos recibidos en el objeto per
        per.setNombre(nombre);
        per.setTelefono(telefono);
        per.setCorreo(Correo);
        
        //colocar a per como atributo de request
        request.setAttribute("persona", per);
        //Derivamos el control a outout.jsp incluye el objeto request
        request.getRequestDispatcher("output.jsp").forward(request, response);
        
    }
}
