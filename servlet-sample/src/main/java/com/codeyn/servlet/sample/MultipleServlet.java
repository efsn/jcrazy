package com.codeyn.servlet.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig(location = "/upload")
@WebServlet("/file")
public class MultipleServlet extends HttpServlet {
    private static final long serialVersionUID = 7750399113425066530L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("File upload post.");
    }

}
