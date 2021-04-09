package test.java.model;

import model.ZakazDAO;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import javax.servlet.ServletException;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import model.Dele;

public class DeleTest{
    private Dele servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    @Before
    public void setUp() {
        servlet = new Dele();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
    @Test
    protected void delettest()
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        ZakazDAO.delete(id);
        response.sendRedirect(request.getContextPath() + "/index");
        servlet.doPost(request, response);

    }
}