package model;

import model.ZakazDAO;
import model.ZakazEntity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Red")
public class Red extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String description = request.getParameter("description");
            String email = request.getParameter("email");
            ZakazEntity product = new ZakazEntity(id, name, description,email);
            ZakazDAO.update(product);
            response.sendRedirect(request.getContextPath() + "/index");

    }
}