
package com.coltis.HolaMundoSpring.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//Anotacion
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    //creacion metodo agregar vista controlador add
    public void addViewControllers(ViewControllerRegistry registro){
        
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/login");
        registro.addViewController("/errores/403").setViewName("/errores/403");
    }

}
