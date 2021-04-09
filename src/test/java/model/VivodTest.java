package test.java.model;

import model.Vivod;
import model.ZakazDAO;
import model.ZakazEntity;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


public class VivodTest{
    private Vivod servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    @Before
    public void setUp() {
        servlet = new Vivod();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
    @Test
    protected void vivodtest()
            throws ServletException, IOException {

        ArrayList<ZakazEntity> products = ZakazDAO.select();
        request.setAttribute("products", products);

        servlet.getServletContext().getRequestDispatcher("/vivod.jsp").forward(request, response);
        servlet.doGet(request, response);


    }
}