package com.appspot.bartgaepoc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WarmupListener implements ServletContextListener {

    private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.appspot.bartgaepoc");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}
