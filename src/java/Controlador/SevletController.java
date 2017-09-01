package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Touchier
 */
@WebServlet(name = "SevletController", urlPatterns = {"/SevletController"})
public class SevletController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /* Inicializamos variables */
        sumaTo sumaT= new sumaTo();
        sumaBo sumaB= new sumaBo();
        /* Damos datos */
        sumaB.setNumA(Integer.parseInt(request.getParameter("numA")));
        sumaB.setNumB(Integer.parseInt(request.getParameter("numB")));
        /* Creamos la sesion y traemos el resultado dandoselo a esta */
        HttpSession sesion = request.getSession();
        sumaT.sumaBO(sumaB);
        sesion.setAttribute("resultado", sumaT.suma());
        /* Enviamos a la pagina que mostrara el resultado */
        response.sendRedirect("Vista/resultadosJSP.jsp");
        /*response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevletController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevletController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
