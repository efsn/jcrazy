package com.codeyn.servlet.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "x-default", value = "/sample/get", initParams = {
        @WebInitParam(name = "charset", value = "utf8") }, asyncSupported = true, loadOnStartup = 1)
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = -1047450065404748215L;

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet init with " + getServletConfig().getInitParameter("charset"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().log("serlvet");
        System.out.println(getServletConfig().getInitParameter("charset"));
    }

}
