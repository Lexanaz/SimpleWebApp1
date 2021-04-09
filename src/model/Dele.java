package model;

import model.ZakazDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Del")
public class Dele extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            int id = Integer.parseInt(request.getParameter("id"));
            ZakazDAO.delete(id);
            response.sendRedirect(request.getContextPath() + "/index");

    }
}