package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//Аннотируем и определяем имя сервлету
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    private transient ServletConfig config;

    public void init(ServletConfig servletConfig) {
        this.config = config;
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info("New request");

        res.getWriter().println("Hello:)))");

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        logger.info("destroy!!!!!!!!!!");
    }


}
