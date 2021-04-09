package test.java.model;

import model.Red;
import model.ZakazDAO;
import model.ZakazEntity;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import javax.servlet.ServletException;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


public class RedTest{
    private Red servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    @Before
    public void setUp() {
        servlet = new Red();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
    @Test
    protected void redtest()
            throws ServletException, IOException {


        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String email = request.getParameter("email");
        ZakazEntity product = new ZakazEntity(id, name, description,email);
        ZakazDAO.update(product);
        response.sendRedirect(request.getContextPath() + "/index");
        servlet.doPost(request, response);


    }
}