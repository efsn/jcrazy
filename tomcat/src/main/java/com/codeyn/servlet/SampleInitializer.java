package com.codeyn.servlet;

import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.http.HttpServlet;

@HandlesTypes({ HttpServlet.class, Filter.class })
public class SampleInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        for (Class<?> clazz : c) {
            System.out.println(clazz.getName());
        }
        System.out.println("The sample of servlet container initializer.");
    }

}
