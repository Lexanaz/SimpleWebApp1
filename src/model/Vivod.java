package model;

import model.ZakazDAO;
import model.ZakazEntity;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/")
public class Vivod extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<ZakazEntity> products = ZakazDAO.select();
        request.setAttribute("products", products);

        getServletContext().getRequestDispatcher("/vivod.jsp").forward(request, response);
    }
}