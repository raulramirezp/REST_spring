package com.endava.internship8.jersey;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/* Application context
 * Donde se incluyen los bins de ña aplicacion.
  * */
@SpringBootApplication
public class JerseyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        new JerseyApplication()
                .configure(new SpringApplicationBuilder(JerseyApplication.class))
                .run(args);
    }




}
