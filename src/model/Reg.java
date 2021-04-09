package model;

import model.ZakazEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/Reg", urlPatterns = "/Reg")
public class Reg extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
    }
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

}
