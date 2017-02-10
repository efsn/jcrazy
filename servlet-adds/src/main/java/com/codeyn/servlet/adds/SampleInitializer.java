package com.codeyn.servlet.adds;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import javax.servlet.annotation.WebFilter;

@HandlesTypes({ SampleServlet.class, WebFilter.class })
public class SampleInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        // ctx.addListener(ServletContextListener.class);

        System.out.println("[Adds] The sample of servlet container initializer is loading.");
        for (Class<?> clazz : c) {
            System.out.println("[Adds] " + clazz.getName());
        }
        System.out.println("[Adds] The sample of servlet container initializer is success.");
    }

}
