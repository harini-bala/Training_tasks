package controller;

import dao.UserDAO;
import entity.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        String action = request.getServletPath();
        try {
            switch (action) {
                case "/insert":
                    addUser(request, response);
                    break;
                case "/demo":
                    response.sendRedirect("demo.jsp");
                    break;
                default:
                    response.getWriter().write("Default case!!");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User newUser = new User(name, email, country);
        userDAO.insertUser(newUser);
        response.sendRedirect("index.jsp");
    }
}


