package test.java.model;

import model.Reg;
import model.ZakazDAO;
import model.ZakazEntity;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;


public class RegTest{
    private Reg servlet;
    private MockHttpServletRequest request;
    private MockHttpServletResponse response;
    @Before
    public void setUp() {
        servlet = new Reg();
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }
    @Test
    protected void regtest()
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String desc = request.getParameter("desc");
        String email = request.getParameter("mail");
        ZakazEntity zak = new ZakazEntity();
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        zak.setName(name);
        zak.setDescription(desc);
        zak.setEmail(email);
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(zak);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        response.sendRedirect(request.getContextPath() + "/index");
        servlet.doPost(request, response);


    }
}