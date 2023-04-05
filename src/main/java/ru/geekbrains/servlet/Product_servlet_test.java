package ru.geekbrains.servlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.src.Product_getProduct_test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//Аннотируем и определяем имя сервлету
@WebServlet(name = "Product_servlet_test", urlPatterns = "/product_test")
public class Product_servlet_test implements Servlet {


    private static Logger logger = LoggerFactory.getLogger(Product_servlet_test.class);

    //несерриализируемая переменная хранения конфигурации
    private transient ServletConfig config;
    //---------------------------------------------------------------------------------------

    // Метод вызывается контейнером после того как был создан класс сервлета
    public void init(ServletConfig servletConfig) {
        this.config = config;
    }

    public ServletConfig getServletConfig() {
        //тут, если что, вернём конфиг
        return config;
    }
    // Метод вызывается для каждого нового HTTP запроса к данному сервлету
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        logger.info("New request");
        // получаем объект типа BufferedWriter и пишем в него ответ на пришедший запрос
        Product_getProduct_test test = new Product_getProduct_test();
        String sTest = test.getProductListHTML();
        res.getWriter().println(sTest);

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        logger.info("destroy!!!!!!!!!!");
    }


}
